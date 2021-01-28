package sg.edu.iss.app.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.datavec.image.loader.ImageLoader;
import org.deeplearning4j.nn.modelimport.keras.KerasModelImport;
import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.service.FoodService;

@RestController
@RequestMapping(path="/api/image")
public class MLModelController {

	private String FILE_PATH_ROOT = "src/main/resources/static/image/";
	
	@Autowired
	private FoodService foodservice;
	private final int length=200;//64 for fruit
	private final int width=200;//64 for fruit
	private final int channel=3;//3 for fruit
//	private final int length=64;//64 for fruit
//	private final int width=64;//64 for fruit

	//predict the image submitted and store that inside the localhost server folder
	@RequestMapping("/predict")
	public ResponseEntity<Food>predictFood(@RequestBody MultipartFile image) throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException{
		
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

//		String modeldir="src/main/resources/model/cnn_sample1.h5";
		String modeldir="src/main/resources/model/IdentifyFoodRGB.h5";
		MultiLayerNetwork model=KerasModelImport.importKerasSequentialModelAndWeights(modeldir);
		
//		Path source = Paths.get("src/main/resources/static/image/apple_7.jpg");
//		Path source = Paths.get("src/main/resources/static/image/img1.jpg");
//		InputStream is = new FileInputStream(source.toFile());

		
		String username=image.getOriginalFilename().split("_")[0];
		System.out.println(username);
		InputStream is = image.getInputStream();
		BufferedImage originalImage = ImageIO.read(is);
		File outputfile = new File(FILE_PATH_ROOT+"savedimage.png");//think what name it is
		
	    ImageIO.write(originalImage, "png", outputfile);

		ImageLoader iml= new ImageLoader(length,width,channel);
		//INDArray features2= iml.asMatrix(originalImage);
		String info=iml.asMatrix(originalImage).shapeInfoToString();
		INDArray features2= iml.asMatrix(originalImage).reshape(1,channel,width,length);
	
		// get the prediction
		double max=0.0;
		int maxindex=0;
		for(int x=0;x<mapping.size();x++) {
			double el=model.output(features2).getRow(0).getDouble(x);
			if(el>max) {
				max=el;
				maxindex=x;
			}
		}
		

		String name=mapping.get(maxindex);
		//Food fooddata= foodservice.findFoodByName(name);
		Food fooddata = new Food(name,200.0);
		System.out.println(name+"_"+max);
		
		return new ResponseEntity<>(fooddata, HttpStatus.OK);
	}
	
	//retrieve the image via http request
    @GetMapping("/{filename}")
    public ResponseEntity<byte[]> getImage(@PathVariable("filename") String filename) {
        byte[] image = new byte[0];
        try {
            image = FileUtils.readFileToByteArray(new File(FILE_PATH_ROOT+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image);
    }
	
	

}
