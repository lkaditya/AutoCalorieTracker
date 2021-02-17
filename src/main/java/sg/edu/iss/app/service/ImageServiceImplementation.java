package sg.edu.iss.app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.repo.FoodRepository;
import sg.edu.iss.app.repo.ImageRepository;

@Service
public class ImageServiceImplementation implements ImageService {

	@Autowired
	private ImageRepository imagerepo;
	
	@Autowired
	private FoodRepository foodrepo;

	@Override
	public void storeNewImage(FoodImage img) {
		 imagerepo.save(img);
		
	}

	@Override
	@Transactional
	public List<FoodImage> findByHid(Long id) {
		List<FoodImage> foodImages = imagerepo.findAllById(id);
		return foodImages;
	}
	
	@Override
	@Transactional
	public List<FoodImage>findImageByDateAndEmail(LocalDate date, String email){
		List<FoodImage> res=imagerepo.findAllByDateAndName(date, email);
		return res;
	}

	@Override
	@Transactional
	public void deleteImage(Long id) {
		FoodImage f= imagerepo.findById(id).get();
		imagerepo.delete(f);	
	}

	@Override
	@Transactional
	public List<FoodImage> findImageByCalories(double remainder) {
		
		return imagerepo.findAllUniqueByCalories(remainder);
	}

	@Override
	@Transactional
	public void updateImage(Long id1, String name, double cal) {
		FoodImage a=imagerepo.findById(id1).get();
		a.setCalorie(cal);
		a.setFoodName(name);
		System.out.println("name input="+name);
		
		String[]group=name.toLowerCase().split(" ");
		List<String> arrlist=new ArrayList<String>(Arrays.asList(group));
		//TODO: find more idea to map image to the correct food in case the name is similar
		//Food f=foodrepo.findSimilarFoodByName(arrlist);

		Food f=foodrepo.findByNameContains(name.toLowerCase());
		if(f!=null) {
			a.setFood(f);
		}
		imagerepo.save(a);
	}

	@Override
	@Transactional
	public List<FoodImage> findAll() {
		return imagerepo.findAll();
	}
	
	@Override
	@Transactional
	public int findTotalCaloriesByDailyHistoryId(long id) {
		Integer result = imagerepo.findTotalCaloriesById(id);
		if(result==null) {
			result = 0;
		}
		return result;
	}
	@Override
	@Transactional
	public FoodImage findImageById(Long id) {
		return imagerepo.findImageById(id);
	}

	public List<FoodImage> findAllByImageId(){
		return imagerepo.findAllByImageId();
	}



}
