package sg.edu.iss.app.controller;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.app.model.*;
import sg.edu.iss.app.service.*;

import javax.servlet.http.HttpSession;


@RequestMapping("/history")
@RestController
public class historyController {

    @Autowired
    private DailyHistoryService dailyHistoryService;

    @Autowired
    private ImageService imageService;

    @Autowired
    UserService userService;


    @Autowired
    DietPlanService dietPlanService;

    @Autowired
    ActivityService activityService;

    @RequestMapping("/getTodayHistory")
    public List<FoodImage> getHistory(@RequestParam("date")String date,@RequestParam("email")String email){
    	DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate date1=LocalDate.parse(date,df);
    	return imageService.findImageByDateAndEmail(date1, email);
    }
    
    @RequestMapping("/deleteImage/{id}")
    public void deleteImageById(@PathVariable long id){
    		System.out.println("id= "+id);
    		imageService.deleteImage(id);
    		return ;
    }
    
    @RequestMapping("/updateImage")
    public void updateImage(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("calorie")String calorie){
    		System.out.println("id= "+id);
    		Long id1=Long.parseLong(id);
    		double cal=Double.valueOf(calorie);
    		imageService.updateImage(id1,name,cal);
    		return ;
    }

    @RequestMapping("/getData")
    public BarChartData getData(HttpSession session){

        List<LocalDate> localDataList=new ArrayList<LocalDate>();
        List<String> localDataList2=new ArrayList<String>();
        List<Double> caloriesList=new ArrayList<Double>();
        User user = (User) session.getAttribute("user");
        Long id = user.getId();


        List<DailyHistory> recordByUserID = dailyHistoryService.findRecordByUserID(id);
        double recommendedCalories = user.getRecommendedCalories();

        for (DailyHistory dailyHistory : recordByUserID) {
            double totalCalories=0.0;
            Long dailyHistoryId = dailyHistory.getId();
            List<FoodImage> images = imageService.findByHid(dailyHistoryId);

            LocalDate date = dailyHistory.getDate();
            localDataList.add(date);
            for (FoodImage listOfFoodImage : images) {

                double calorie = listOfFoodImage.getCalorie();
                totalCalories+=calorie;
            }

            caloriesList.add(totalCalories);
        }

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        for (LocalDate localDate : localDataList) {
            String format = localDate.format(fmt);
            localDataList2.add(format);
        }

        Map<String,Object> map=new HashMap<>();

        map.put("localDataList",localDataList2);
        map.put("caloriesList",caloriesList);
        map.put("recommendedCalories",recommendedCalories);

        BarChartData barChartData=new BarChartData(map);

        return barChartData;
    }
    


    @RequestMapping("/getImageByData")
    public BarChartData getData(String data,HttpSession session){
        User user = (User)session.getAttribute("user");

        String newData = data.replace("/", "-");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date= LocalDate.parse(newData, fmt);
        DailyHistory dailyRecord = dailyHistoryService.findRecordByIdAndDate(user.getId(), date);
        List<FoodImage> images = imageService.findByHid(dailyRecord.getId());
        List<String> urls=new ArrayList<>();
        List<String> foodNames=new ArrayList<>();
        List<Double> Calories=new ArrayList<>();
        List<String> timeSeries=new ArrayList<>();
        for (FoodImage image : images) {
            String url = image.getUrl();
            urls.add(url);
            foodNames.add(image.getFoodName());
            //TODO : inconsistent data source for 1 set of data? need further changes??
            Calories.add(image.getCalorie());
            Long epochDateUpload = image.getEpochDateUpload();
            String time = dateConvert(epochDateUpload);
            timeSeries.add(time);

        }
        Map<String,Object> map=new HashMap<>();
        map.put("imagesInfo",urls);
        map.put("foodNames",foodNames);
        map.put("Calories",Calories);
        map.put("time",timeSeries);
        BarChartData barChartData=new BarChartData(map);
        return barChartData;
    }

    public static String dateConvert(long milliSecond){
        Date date = new Date();
        date.setTime(milliSecond);
        String time = new SimpleDateFormat("KK:mm aa", Locale.ENGLISH).format(date);
        return time;
    }


}
