package sg.edu.iss.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sg.edu.iss.app.model.DailyHistory;
import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.model.BarChartData;
import sg.edu.iss.app.service.DailyHistoryService;
import sg.edu.iss.app.service.FoodService;
import sg.edu.iss.app.service.ImageService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("/history")
@RestController
public class historyController {

    @Autowired
    private DailyHistoryService dailyHistoryService;

    @Autowired
    private ImageService imageService;

    @Autowired
    private FoodService foodService;




    @RequestMapping("/getData")
    public BarChartData getData(){

        List<LocalDate> localDataList=new ArrayList<LocalDate>();
        List<String> localDataList2=new ArrayList<String>();
        List<Double> caloriesList=new ArrayList<Double>();
        List<DailyHistory> recordByUserID = dailyHistoryService.findRecordByUserID(1L);


        for (DailyHistory dailyHistory : recordByUserID) {
            double totalCalories=0.0;
            Long dailyHistoryId = dailyHistory.getId();
            List<FoodImage> images = imageService.findByHid(dailyHistoryId);

            LocalDate date = dailyHistory.getDate();
            localDataList.add(date);
            for (FoodImage listOfFoodImage : images) {

                double calorie = listOfFoodImage.getFood().getCalorie();
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

        BarChartData barChartData=new BarChartData(map);

        return barChartData;
    }



    @RequestMapping("/getImageByData")
    public BarChartData getData(String data){
        String newData = data.replace("/", "-");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date= LocalDate.parse(newData, fmt);
        DailyHistory dailyRecord = dailyHistoryService.findRecordByIdAndDate(1L, date);
        List<FoodImage> images = imageService.findByHid(dailyRecord.getId());
        List<String> urls=new ArrayList<>();
        List<String> foodNames=new ArrayList<>();
        List<Double> Calories=new ArrayList<>();
        for (FoodImage image : images) {
            String url = image.getUrl();
            urls.add(url);
            foodNames.add(image.getFoodName());
            Calories.add(image.getFood().getCalorie());
        }
        Map<String,Object> map=new HashMap<>();
        map.put("imagesInfo",urls);
        map.put("foodNames",foodNames);
        map.put("Calories",Calories);
        BarChartData barChartData=new BarChartData(map);
        return barChartData;
    }


}
