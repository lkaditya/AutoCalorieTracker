package sg.edu.iss.app.service;

import sg.edu.iss.app.model.FoodImage;

import java.time.LocalDate;
import java.util.List;

public interface ImageService {
	
	public void storeNewImage(FoodImage img);
	
	public void deleteImage(Long id);
	
	public List<FoodImage> findByHid(Long id);

	public List<FoodImage> findImageByDateAndEmail(LocalDate date, String email);

	public List<FoodImage> findImageByCalories(double remainder);

	public void updateImage(Long id1, String name, double cal);
}
