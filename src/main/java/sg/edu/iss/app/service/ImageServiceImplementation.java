package sg.edu.iss.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.repo.ImageRepository;

@Service
public class ImageServiceImplementation implements ImageService {

	@Autowired
	private ImageRepository imagerepo;

	@Override
	public void storeNewImage(FoodImage img) {
		 imagerepo.save(img);
		
	}

}
