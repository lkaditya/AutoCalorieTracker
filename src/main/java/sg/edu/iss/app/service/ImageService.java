package sg.edu.iss.app.service;

import sg.edu.iss.app.model.FoodImage;

import java.time.LocalDate;
import java.util.List;

public interface ImageService {
	
	public void storeNewImage(FoodImage img);
	
	public List<FoodImage> findByHid(Long id);

	public List<FoodImage> findImageByDateAndEmail(LocalDate date, String email);
}
