package sg.edu.iss.app.service;

import sg.edu.iss.app.model.FoodImage;

import java.util.List;

public interface ImageService {
	
	public void storeNewImage(FoodImage img);
	
	public List<FoodImage> findByHid(Long id);
}
