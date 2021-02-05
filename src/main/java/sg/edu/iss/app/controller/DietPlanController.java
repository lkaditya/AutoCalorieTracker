package sg.edu.iss.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sg.edu.iss.app.model.*;
import sg.edu.iss.app.service.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Controller
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

    @RequestMapping("/showPlan")
    public String showPlan(Model model){
        User user = userService.findById(1L);
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
            double netCalories=total-caloriesBurnt;
            model.addAttribute("netCalories",netCalories);


            for (Food food: foodList) {
                FoodImage foodImage = food.getFoodImage().get(random.nextInt(food.getFoodImage().size()));
                foodInfo.add(foodImage);
            }
            model.addAttribute("foodInfos",foodInfo);
            model.addAttribute("activity",activity);
            model.addAttribute("date",date);
            model.addAttribute("Tomorrow","Tomorrow");
            return "dietPlan";


        }else {
            double recommendedCalories = user.getRecommendedCalories();

            List<FoodImage> foodImagesList = imageService.findAll();

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

            for (FoodImage food:foodImagesList) {
                double calorie = food.getFood().getCalorie();
                if (total<=recommendedCalories){
                    total+=calorie;
                    foodInfo.add(food);
                    food.getFood().getDietPlan().add(dietPlan);
                    dietPlan.getFood().add(food.getFood());
                }
            }
            dietPlanService.savePlan(dietPlan);

            double netCalories=total-caloriesBurnt;
            model.addAttribute("foodInfos",foodInfo);
            model.addAttribute("activity",activity);
            model.addAttribute("date",date);
            model.addAttribute("Tomorrow","Tomorrow");
            model.addAttribute("netCalories",netCalories);

            return "dietPlan";




        }




    }


    @RequestMapping("/showTomorrowPlan")
    public String showTomorrowPlan(Model model){
        User user = userService.findById(1L);
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
            double netCalories=total-caloriesBurnt;
            model.addAttribute("netCalories",netCalories);

            for (Food food: foodList) {
                FoodImage foodImage = food.getFoodImage().get(random.nextInt(food.getFoodImage().size()));
                foodInfo.add(foodImage);
            }
            model.addAttribute("foodInfos",foodInfo);
            model.addAttribute("activity",activity);
            model.addAttribute("date",tomorrow);
            model.addAttribute("Today","Today");

            return "dietPlan";


        }else {
            double recommendedCalories = user.getRecommendedCalories();

            List<FoodImage> foodImagesList = imageService.findAll();

            Collections.shuffle(foodImagesList);

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
            for (FoodImage food:foodImagesList) {
                double calorie = food.getFood().getCalorie();
                if (total<=recommendedCalories){
                    total+=calorie;
                    foodInfo.add(food);
                    food.getFood().getDietPlan().add(dietPlan);
                    dietPlan.getFood().add(food.getFood());
                }
            }
            dietPlanService.savePlan(dietPlan);


            double netCalories=total-caloriesBurnt;

            model.addAttribute("foodInfos",foodInfo);
            model.addAttribute("activity",activity);
            model.addAttribute("date",tomorrow);
            model.addAttribute("Today","Today");
            model.addAttribute("netCalories",netCalories);

            return "dietPlan";




        }




    }
}
