package sg.edu.iss.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.repo.ImageRepository;

import java.util.List;

@Service
public class ImageServiceImplementation implements ImageService {

	@Autowired
	private ImageRepository imagerepo;

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


}
