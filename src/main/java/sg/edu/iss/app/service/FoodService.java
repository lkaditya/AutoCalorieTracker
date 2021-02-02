package sg.edu.iss.app.service;

import java.util.Date;
import java.util.List;

import sg.edu.iss.app.model.Food;

public interface FoodService {
	
	public Food findFoodByName(String name);
	

	public Food findFoodByImageId(Long id);
}
