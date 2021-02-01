package sg.edu.iss.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.service.ImageService;

@RestController
@RequestMapping("/api/food")
public class FoodController {
	
	 @Autowired
	    private ImageService imageService;
	
	@RequestMapping("/getSuggestion")
	public List<FoodImage>getRecommendedFood(@RequestParam("remainder")double remainder){
		List<FoodImage> content=imageService.findImageByCalories(remainder);
		List<String> foodnamefiltered=content.stream().map(x->x.getFood().getName()).distinct().collect(Collectors.toList());
		List<FoodImage> filtered= new ArrayList<FoodImage>();
		for(String x : foodnamefiltered) {
			for(FoodImage f :content) {
				if(f.getFood().getName().contentEquals(x)) {
					filtered.add(f);
					break;
				}
			}
		}
		return filtered;
	}
	
	



}
