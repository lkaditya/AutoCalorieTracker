package sg.edu.iss.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.repo.ImageRepository;

@SpringBootTest
class AutoCalorieTrackerApplicationTests {

	@Autowired
	private ImageRepository imagerepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void printEpoch() {
		Long n=1612093584697L;
		n=System.currentTimeMillis();
        
        Date date = new Date(n);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("Asia/Singapore"));
        String formatted = format.format(date);
        System.out.println(formatted);
        format.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        formatted = format.format(date);
        System.out.println(formatted);
	}
	
	@Test
	void query() {
		Long id=1L;
		List<FoodImage> f= imagerepo.findAllById(id);
		System.out.println("size= "+f.size());
	}

}
