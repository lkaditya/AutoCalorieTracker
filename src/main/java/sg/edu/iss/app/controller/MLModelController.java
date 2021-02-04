package sg.edu.iss.app.controller;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

import sg.edu.iss.app.model.DailyHistory;
import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.DailyHistoryService;
import sg.edu.iss.app.service.FoodService;
import sg.edu.iss.app.service.ImageService;
import sg.edu.iss.app.service.UserService;

@RestController
@RequestMapping(path="/api/image")
public class MLModelController {

	private String FILE_PATH_ROOT = "src/main/resources/static/image/";
	
	@Autowired
	private FoodService foodservice;
	@Autowired
	private ImageService imgservice;
	@Autowired
	private UserService userservice;
	@Autowired
	private DailyHistoryService historyservice;
	
	private final String modeldir="src/main/resources/model/";
	private final int length=200;//64 for fruit
	private final int width=200;//64 for fruit
	private final int channel=3;//3 for fruit
//	private final int length=64;//64 for fruit
//	private final int width=64;//64 for fruit

	//predict the image submitted and store that inside the localhost server folder
	@RequestMapping("/predict")
	public ResponseEntity<Food> predictFood(@RequestBody MultipartFile image) throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException{
		

		InputStream is = image.getInputStream();
		BufferedImage originalImage = ImageIO.read(is);
		
		LocalDate date= LocalDate.now();
		String imagename=image.getOriginalFilename();
		String email=imagename.split("_")[0];
		System.out.println(email);
		User user=userservice.findUserByEmail(email);
		
		File outputfile = new File(FILE_PATH_ROOT+imagename);//think what name it is
	    ImageIO.write(originalImage, "png", outputfile);

	    
		DailyHistory hist=historyservice.findHistoryByEmailandDate(email, date);
	    FoodImage img= new FoodImage();
	    
	    //String name=predictExecuteDL4J(originalImage);
	    String name=predictExecutePython(FILE_PATH_ROOT+imagename);
	    System.out.println("name= "+name);
	    
	    Food fooddata= foodservice.findFoodByName(name);
	    img.setFood(fooddata);
	    img.setFoodName(fooddata.getName());
	    img.setCalorie(fooddata.getCalorie());
	    img.setUrl("http://localhost:8080/api/image/"+imagename);
	    img.setEpochDateUpload(System.currentTimeMillis());
		if(hist==null) {
			System.out.println("it goes to create new history");
			hist=new DailyHistory(); 
			hist.setDate(date);
			hist.setUser(user);
			img.setDailyHistory(hist);
			List<FoodImage>listOfFoodImages= new ArrayList<FoodImage>();
			listOfFoodImages.add(img);
			hist.setListOfFoodImages(listOfFoodImages);	
		}else {
			img.setDailyHistory(hist);
			hist.getListOfFoodImages().add(img);
		}
		historyservice.save(hist);
	    
	   	    
		
		//Food fooddata = new Food(name,200.0);
		System.out.println(fooddata.getName());
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
    
    public String predictExecuteDL4J(BufferedImage originalImage) throws IOException, InvalidKerasConfigurationException, UnsupportedKerasConfigurationException {
		//current hardcoding mapping from python result
		Map<Integer,String>mapping= new HashMap<Integer,String>();
		mapping.put(0, "laksa");
		mapping.put(1, "chicken rice");
		mapping.put(2, "cheeseburger");
		mapping.put(3, "fish and chips");
		mapping.put(4, "pizza");


		MultiLayerNetwork model=KerasModelImport.importKerasSequentialModelAndWeights(modeldir+"IdentifyFoodRGB.h5");
		ImageLoader iml= new ImageLoader(length,width,channel);
		INDArray features2= iml.asMatrix(originalImage).reshape(1,width,length,channel);
	
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
		
		return name;    	
    }
    
	public String predictExecutePython(String abspath) {
	String res = "";

	try {
		String absolutePath = FileSystems.getDefault().getPath(modeldir+"call_by_python.py").normalize().toAbsolutePath().toString();
		String input = FileSystems.getDefault().getPath(abspath).normalize().toAbsolutePath().toString();
		String modelPath = FileSystems.getDefault().getPath(modeldir+"m5.h5").normalize().toAbsolutePath().toString();
		Process p = Runtime.getRuntime().exec("python "+absolutePath+" "+input+" "+modelPath);
		BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while ((line = in.readLine()) != null) {
			res += line;
		}

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return res;
}
	
	

}
