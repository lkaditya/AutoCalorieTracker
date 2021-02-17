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
    
    @RequestMapping("/showTodayPlanAndroid")
    public Map<String,Object> showTodayPlanAndroid(@RequestParam("date")String date,@RequestParam("email")String email) {
    	User user = userService.findUserByEmail(email);
    	DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate date1=LocalDate.parse(date,df);
        Random random=new Random();
        List<FoodImage> foodInfo=new ArrayList<>();
    	List<Food> listOfFood = foodService.findAll();
    	Map<String,Object> map=new HashMap<>();
        
    	//check for existing plan
    	DietPlan plan = null;
    	try {
            plan = dietPlanService.findByDate(date1, user.getId());
        }catch (Exception e){
            System.out.println(e);
        }
    	
    	//if there is existing dietplan
        if (!(plan==null)){
        	
        	Activity activity = plan.getActivity();
        	List<Food> dietPlanFoods = plan.getFood();
        	List<FoodImage> resultFoodImages = new ArrayList<>();
        	
        	for(Food food : dietPlanFoods) {
        		resultFoodImages.add(imageService.findImageById(food.getId()));
        	}
        	
        	//update map to send to front end
        	map.put("activity",activity);
            map.put("resultFoodImages",resultFoodImages);
            
            return map;
        } else { //if there is no existing dietplan, create dietplan
        	//create new diet plan
            DietPlan dietPlan=new DietPlan();
            List<FoodImage> foodImagesList = imageService.findAll();
            double recommendedCalories = user.getRecommendedCalories();
            double total=0.0;
            
            //add activity in dietplan
            List<Activity> activities = activityService.findAll();
            int randomNum = random.nextInt(activities.size());
            Activity activity = activities.get(randomNum);
            double caloriesBurnt = activity.getCaloriesBurnt();
            
            //set dietplan
            dietPlan.setDate(date1);
            dietPlan.setActivity(activity);
            dietPlan.setUser(user);
            
            
//          pick 3 numbers from food, no repeats, no crossing recommended calories
        	int maxNumberOfItems = 3;
        	int itemCounter = 0;
        	int CaloriesCounter = 0;
        	int min = 1;
        	int max = listOfFood.size();
        	List<Integer> resultFood = new ArrayList<>();
        	        	while(itemCounter < maxNumberOfItems && CaloriesCounter < recommendedCalories) {
        		int ran = (int) (Math.random()*(max-min+1) + min);
        		int calorie = (int)listOfFood.get(ran-1).getCalorie();
        		
        		if(CaloriesCounter+calorie < recommendedCalories && !resultFood.contains(ran)){
        			CaloriesCounter += calorie;
        			resultFood.add(ran);
            		itemCounter++;
        		}
        	}
        	        	
        	//get foodimages
        	List<FoodImage> resultFoodImages = new ArrayList<>();
        	for (int i : resultFood) {
	    		//get food
	    		FoodImage food = imageService.findImageById((long)i);
	    		System.out.println(food.getId());
	    		resultFoodImages.add(food);
	    		food.getFood().getDietPlan().add(dietPlan);
	    		dietPlan.getFood().add(food.getFood());
	    		dietPlanService.savePlan(dietPlan);
        	}
        	
            //update map to send to front end
            map.put("resultFoodImages",resultFoodImages);
            map.put("activity",activity);
            
            return map;
        }
    }
    
    
}
