package sg.edu.iss.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sg.edu.iss.app.model.*;
import sg.edu.iss.app.service.*;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@RequestMapping("/plan")
public class DietPlanController {

    @Autowired
    UserService userService;

    @Autowired
    ImageService imageService;

    @Autowired
    DietPlanService dietPlanService;

    @Autowired
    ActivityService activityService;

    @Autowired
    FoodService foodService;





    @RequestMapping("/showTomorrowPlan")
    public BarChartData showTomorrowPlan(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        double recommendedCalories = user.getRecommendedCalories();
        LocalDate date = LocalDate.now();
        LocalDate tomorrow = date.plusDays(1);

        Random random = new Random();
        List<FoodImage> foodInfo = new ArrayList<FoodImage>();
        DietPlan plan = null;
        try {
            plan = dietPlanService.findByDate(tomorrow, user.getId());

        } catch (Exception e) {
            System.out.println("");
        }
        if (!(plan == null)) {
            Activity activity = plan.getActivity();
            List<Food> foodList = plan.getFood();
            double total = 0.0;
            for (Food food : foodList) {
                double calorie = food.getCalorie();
                total += calorie;
            }
            double caloriesBurnt = activity.getCaloriesBurnt();
            double netCalories = total - caloriesBurnt;


            for (Food food : foodList) {
                FoodImage foodImage = food.getFoodImage().get(0);
                foodInfo.add(foodImage);
            }
            Map<String, Object> map = new HashMap<>();
            map.put("netCalories", netCalories);
            map.put("foodInfos", foodInfo);
            map.put("activity", activity);

            BarChartData data = new BarChartData();
            data.setData(map);
            return data;


        } else {

            Map<String, Object> map = createDietPlan(tomorrow, user);
            BarChartData data = new BarChartData();
            data.setData(map);
            DietPlan dietPlan = (DietPlan)map.get("dietPlan");
            return data;
        }


    }


    @RequestMapping("/showPlan")
    public BarChartData showPlan(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        double recommendedCalories = user.getRecommendedCalories();
        LocalDate date = LocalDate.now();

        Random random = new Random();
        List<FoodImage> foodInfo = new ArrayList<FoodImage>();
        DietPlan plan = null;
        try {
            plan = dietPlanService.findByDate(date, user.getId());

        } catch (Exception e) {
            System.out.println("");
        }
        if (!(plan == null)) {
            Activity activity = plan.getActivity();
            List<Food> foodList = plan.getFood();

            double total = 0.0;
            for (Food food : foodList) {
                double calorie = food.getCalorie();
                total += calorie;
            }
            double caloriesBurnt = activity.getCaloriesBurnt();
            double netCalories = total - caloriesBurnt;
            model.addAttribute("netCalories", netCalories);


            for (Food food : foodList) {
                FoodImage foodImage = food.getFoodImage().get(0);
                foodInfo.add(foodImage);
            }
            Map<String, Object> map = new HashMap<>();
            map.put("netCalories", netCalories);
            map.put("foodInfos", foodInfo);
            map.put("activity", activity);

            BarChartData data = new BarChartData();
            data.setData(map);
            return data;


        } else {
            Map<String, Object> map = createDietPlan(date, user);
            BarChartData data = new BarChartData();
            data.setData(map);
            return data;
        }


    }


    public Map<String, Object> createDietPlan(LocalDate date, User user) {

        List<FoodImage> foodInfo = new ArrayList<FoodImage>();
        Random random=new Random();
        double recommendedCalories = user.getRecommendedCalories();

        List<FoodImage> foodImagesList = imageService.findAllByImageId();

        Collections.shuffle(foodImagesList);

        double total = 0.0;
        DietPlan dietPlan = new DietPlan();

        List<Activity> activities = activityService.findAll();
        int randomNum = random.nextInt(activities.size());
        Activity activity = activities.get(randomNum);
        double caloriesBurnt = activity.getCaloriesBurnt();


        dietPlan.setDate(date);
        dietPlan.setActivity(activity);
        dietPlan.setUser(user);
        int count = 0;

        for (FoodImage food : foodImagesList) {
            double calorie = food.getFood().getCalorie();
            if (total <= recommendedCalories && count < 3) {
                total += calorie;
                foodInfo.add(food);
                food.getFood().getDietPlan().add(dietPlan);
                dietPlan.getFood().add(food.getFood());
                count++;
            }
        }
        dietPlanService.savePlan(dietPlan);

        double netCalories = total - caloriesBurnt;
        Map<String, Object> map = new HashMap<>();
        map.put("netCalories", netCalories);
        map.put("foodInfos", foodInfo);
        map.put("activity", activity);
        map.put("dietPlan",dietPlan);
        return map;
    }

    @RequestMapping("/showPlanAndroid")
    public List<DietPlan> showPlan(@RequestParam("date")String date, @RequestParam("email")String email){
        User user = userService.findUserByEmail(email);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1=LocalDate.parse(date,df);
        LocalDate date2=date1.plusDays(1);
        List<DietPlan>doubleplan= new ArrayList<DietPlan>();
        DietPlan todaydiet = dietPlanService.findByDate(date1, user.getId());
        if(todaydiet==null) {

            todaydiet=(DietPlan)createDietPlan(date1,user).get("dietPlan");
            todaydiet.getFood();
        }
        doubleplan.add(todaydiet);
        DietPlan tomorrowdiet = dietPlanService.findByDate(date2, user.getId());
        if(tomorrowdiet==null) {
            tomorrowdiet=(DietPlan)createDietPlan(date2,user).get("dietPlan");
        }
        doubleplan.add(tomorrowdiet);
        return doubleplan;
    }
}
