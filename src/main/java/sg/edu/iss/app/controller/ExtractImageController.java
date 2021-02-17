package sg.edu.iss.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sg.edu.iss.app.model.FoodInfo;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class ExtractImageController {

    private List<FoodInfo> foodInfos;

    @RequestMapping("/showData")
    public String showData(Model model){

        return "mainPage";
    }

    @RequestMapping("/showPlan")
    public String showPlan(Model model){

        return "dietPlan";
    }

    @RequestMapping("/extract")
    public String extractImages(Model model,String url){
        if (url==null){
            url="";

        }

        foodInfos=new ArrayList<>();


        ItemTask itemTask=new ItemTask();

        try {
            String html = itemTask.ItemTaskDownLoad(url);
            itemTask.parse(html,foodInfos);
        } catch (Exception e) {
            System.out.println("");
        }

        List<FoodInfo> foodInfoList=new ArrayList<>();

        for (FoodInfo foodInfo : foodInfos) {
            String foodCalories = foodInfo.getFoodCalories();
            if (!foodCalories.equals("NOT FOUND")){
                foodInfoList.add(foodInfo);
            }
        }


        model.addAttribute("foodInfos",foodInfoList);
        model.addAttribute("url",url);

        return "upload";
    }





}
