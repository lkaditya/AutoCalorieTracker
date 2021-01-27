package sg.edu.iss.app.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.datavec.image.loader.ImageLoader;
import org.deeplearning4j.nn.modelimport.keras.KerasModelImport;
import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.service.FoodService;

@RestController
@RequestMapping(path="/api/prediction")
public class MLModelController {

	public MLModelController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private FoodService foodservice;
	private final int length=200;//64 for fruit
	private final int width=200;//64 for fruit
	private final int channel=3;//3 for fruit
//	private final int length=64;//64 for fruit
//	private final int width=64;//64 for fruit
//	private final int channel=3;//3 for fruit
	
	@RequestMapping("/image")
	public ResponseEntity<Food>predictFood() throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException{
		
		Map<Integer,String>mapping= new HashMap<Integer,String>();
//		mapping.put(0, "apple");
//		mapping.put(1, "banana");
//		mapping.put(2, "mix");
//		mapping.put(3, "orange");
		mapping.put(0, "laksa");
		mapping.put(1, "chicken rice");
		mapping.put(2, "cheeseburger");
		mapping.put(3, "fish and chips");
		mapping.put(4, "pizza");

		//String modeldir="src/main/resources/model/cnn_sample1.h5";
		String modeldir="src/main/resources/model/IdentifyFoodRGB.h5";
		MultiLayerNetwork model=KerasModelImport.importKerasSequentialModelAndWeights(modeldir);
		
//		Path source = Paths.get("src/main/resources/static/image/apple_7.jpg");
		Path source = Paths.get("src/main/resources/static/image/img1.jpg");
		InputStream is = new FileInputStream(source.toFile());
		BufferedImage originalImage = ImageIO.read(is);

		ImageLoader iml= new ImageLoader(length,width,channel);
		//INDArray features2= iml.asMatrix(originalImage);
		String info=iml.asMatrix(originalImage).shapeInfoToString();
		System.out.println(info);
		INDArray features2= iml.asMatrix(originalImage).reshape(1,channel,width,length);
		
		// get the prediction
		double max=0.0;
		int maxindex=0;
		for(int x=0;x<mapping.size();x++) {
			double el=model.output(features2).getDouble(x);
			if(el>max) {
				max=el;
				maxindex=x;
			}
		}
		

		String name=mapping.get(maxindex);
		//Food fooddata= foodservice.findFoodByName(name);
		Food fooddata = new Food(name,200.0);
		
		return new ResponseEntity<>(fooddata, HttpStatus.OK);
	}
	
	

}
