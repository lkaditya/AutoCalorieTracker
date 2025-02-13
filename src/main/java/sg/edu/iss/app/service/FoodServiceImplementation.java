package sg.edu.iss.app.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.repo.FoodRepository;

@Service
@Transactional
public class FoodServiceImplementation implements FoodService{

	public FoodServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private FoodRepository foodrepo;

	@Override
	public Food findFoodByName(String name) {
		return foodrepo.findFoodByName(name);
	}


	@Override
	public Food findFoodByImageId(Long id) {
		return foodrepo.findFoodById(id);
	}

	@Override
	public List<Food> findAll() {
		List<Food> foodList = foodrepo.findAll();
		return foodList;
	}

}
