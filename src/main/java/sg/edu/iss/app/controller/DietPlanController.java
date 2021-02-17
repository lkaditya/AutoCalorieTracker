package sg.edu.iss.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sg.edu.iss.app.model.*;
import sg.edu.iss.app.service.*;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.ZoneId;
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

    @RequestMapping("/showTomorrowPlan")
    public BarChartData showTomorrowPlan(Model model, HttpSession session){
        User user = (User)session.getAttribute("user");
        double recommendedCalories=user.getRecommendedCalories();
        LocalDate date = LocalDate.now();
        LocalDate tomorrow = date.plusDays(1);

        Random random=new Random();
        List<FoodImage> foodInfo=new ArrayList<FoodImage>();
        DietPlan plan=null;
        try {
            plan = dietPlanService.findByDate(tomorrow, user.getId());

        }catch (Exception e){
            System.out.println("");
        }
        if (!(plan==null)){
            Activity activity = plan.getActivity();
            List<Food> foodList = plan.getFood();
            double total=0.0;
            for (Food food : foodList) {
                double calorie = food.getCalorie();
                total+=calorie;
            }
            double caloriesBurnt = activity.getCaloriesBurnt();
            double netCalories=recommendedCalories-caloriesBurnt;



            for (Food food: foodList) {
                FoodImage foodImage = food.getFoodImage().get(0);
                foodInfo.add(foodImage);
            }
            Map<String,Object> map=new HashMap<>();
            map.put("netCalories",netCalories);
            map.put("foodInfos",foodInfo);
            map.put("activity",activity);

            BarChartData data=new BarChartData();
            data.setData(map);
            return data;


        }else {
             recommendedCalories = user.getRecommendedCalories();

            List<FoodImage> foodImagesList = imageService.findAllByImageId();


            double total=0.0;
            DietPlan dietPlan=new DietPlan();

            List<Activity> activities = activityService.findAll();
            int randomNum = random.nextInt(activities.size());
            Activity activity = activities.get(randomNum);
            double caloriesBurnt = activity.getCaloriesBurnt();

            dietPlan.setDate(tomorrow);
            dietPlan.setActivity(activity);
            dietPlan.setUser(user);
//            double totalCalories=0.0;
            int count=0;

            for (FoodImage food:foodImagesList) {
                double calorie = food.getFood().getCalorie();
                if (total<=recommendedCalories&&count<3){
                    total+=calorie;
                    foodInfo.add(food);
                    food.getFood().getDietPlan().add(dietPlan);
                    dietPlan.getFood().add(food.getFood());
                }
                count++;
            }
            dietPlanService.savePlan(dietPlan);


            double netCalories=recommendedCalories-caloriesBurnt;
            Map<String,Object> map=new HashMap<>();
            map.put("foodInfos",foodInfo);
            map.put("activity",activity);
            map.put("netCalories",netCalories);

            BarChartData data=new BarChartData();
            data.setData(map);
            return data;


        }




    }



    @RequestMapping("/showPlan")
    public BarChartData showPlan(Model model, HttpSession session){
        User user = (User)session.getAttribute("user");
        double recommendedCalories=user.getRecommendedCalories();
        LocalDate date = LocalDate.now();

        Random random=new Random();
        List<FoodImage> foodInfo=new ArrayList<FoodImage>();
        DietPlan plan=null;
        try {
            plan = dietPlanService.findByDate(date, user.getId());

        }catch (Exception e){
            System.out.println("");
        }
        if (!(plan==null)){
            Activity activity = plan.getActivity();
            List<Food> foodList = plan.getFood();

            double total=0.0;
            for (Food food : foodList) {
                double calorie = food.getCalorie();
                total+=calorie;
            }
            double caloriesBurnt = activity.getCaloriesBurnt();
            double netCalories=recommendedCalories-caloriesBurnt;
            model.addAttribute("netCalories",netCalories);


            for (Food food: foodList) {
                FoodImage foodImage = food.getFoodImage().get(0);
                foodInfo.add(foodImage);
            }
            Map<String,Object> map=new HashMap<>();
            map.put("netCalories",netCalories);
            map.put("foodInfos",foodInfo);
            map.put("activity",activity);

            BarChartData data=new BarChartData();
            data.setData(map);
            return data;


        }else {
            recommendedCalories = user.getRecommendedCalories();

            List<FoodImage> foodImagesList = imageService.findAllByImageId();

            Collections.shuffle(foodImagesList);

            double total=0.0;
            DietPlan dietPlan=new DietPlan();

            List<Activity> activities = activityService.findAll();
            int randomNum = random.nextInt(activities.size());
            Activity activity = activities.get(randomNum);
            double caloriesBurnt = activity.getCaloriesBurnt();


            dietPlan.setDate(date);
            dietPlan.setActivity(activity);
            dietPlan.setUser(user);
            int count=0;

            for (FoodImage food:foodImagesList) {
                double calorie = food.getFood().getCalorie();
                if (total<=recommendedCalories&&count<3){
                    total+=calorie;
                    foodInfo.add(food);
                    food.getFood().getDietPlan().add(dietPlan);
                    dietPlan.getFood().add(food.getFood());
                    count++;
                }
            }
            dietPlanService.savePlan(dietPlan);

            double netCalories=recommendedCalories-caloriesBurnt;
            Map<String,Object> map=new HashMap<>();
            map.put("netCalories",netCalories);
            map.put("foodInfos",foodInfo);
            map.put("activity",activity);

            BarChartData data=new BarChartData();
            data.setData(map);
            return data;

        }




    }
}
