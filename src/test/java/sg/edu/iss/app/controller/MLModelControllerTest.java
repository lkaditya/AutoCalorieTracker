package sg.edu.iss.app.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.repo.FoodRepository;

public class MLModelControllerTest {

	@Test
	void predictImage() throws IOException {
		String result=new MLModelController().predictExecutePython("src/main/resources/static/image/img1.jpg");
		System.out.println(result);
	}
	
	@Test
	void printEpoch() {
		Long n=1612093584697L;
		n=System.currentTimeMillis();
        Instant i=Instant.ofEpochSecond(n);
        ZoneId sgZone= ZoneId.of("Asia/Singapore");
        ZonedDateTime sgdt=ZonedDateTime.ofInstant(i,sgZone);
        System.out.println(sgdt);
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String timeshown=df.format(sgdt.toLocalDateTime());
        System.out.println(timeshown);
	}

	@Autowired
	FoodRepository foodRepository;
	@Test
	void query3() { //still fail
		String name="pizza";
		Food f=foodRepository.findFoodByName(name);
		System.out.println("size= "+f.toString());
//		System.out.println(f.getName());
	}

	@Test
	void query1() {
		try {
//            Process process = Runtime.getRuntime().exec("python C:/Users/admin/java_call_python.py 101");
			Process process = Runtime.getRuntime().exec("python D:/NUS/ADproject/java_call_python.py 101");
			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
