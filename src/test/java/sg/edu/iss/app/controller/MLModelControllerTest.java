package sg.edu.iss.app.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MLModelControllerTest {

	@Test
	void sendImageData() throws IOException {
		Path source = Paths.get("src/main/resources/static/image/apple_7.jpg");
		InputStream is = new FileInputStream(source.toFile());
		BufferedImage originalImage = ImageIO.read(is);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		  ImageIO.write(originalImage, "jpg", baos);
		  byte[] bytes = baos.toByteArray();
		  
		  RestTemplate restTemplate = new RestTemplate();
	      String url = "http://localhost:8080/api/prediction/image";

	        //EmployeeInfo employee = new EmployeeInfo();
//	        employee.setName("Ashish");
//	        employee.setEmail("anyhing");
//	        employee.setDateOfBirth("mybirthday");
//	        employee.setLocation("home");
	        //ResponseEntity<String> response = restTemplate.postForEntity(url, employee, String.class);

	        //model.setViewName("homePage");
	        //return model;
		

	}

}
