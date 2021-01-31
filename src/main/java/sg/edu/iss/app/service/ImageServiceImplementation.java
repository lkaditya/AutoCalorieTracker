package sg.edu.iss.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


}
