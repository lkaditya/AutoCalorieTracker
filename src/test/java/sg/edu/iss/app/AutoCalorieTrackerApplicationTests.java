package sg.edu.iss.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sg.edu.iss.app.model.Food;
import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.repo.FoodRepository;
import sg.edu.iss.app.repo.ImageRepository;

@SpringBootTest
class AutoCalorieTrackerApplicationTests {

	@Autowired
	private ImageRepository imagerepo;
	
	@Autowired
	private FoodRepository foodrepo;
	
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
	@Test
	void query2() { //still fail
		String name="pizza from pizzahut yesterday";
		String[]group=name.split(" ");
		List<String> arrlist=new ArrayList<String>(Arrays.asList(group));
		Food f=foodrepo.findSimilarFoodByName(arrlist);
		System.out.println("size= "+f.toString());
	}
	@Test
	void query3() { //still fail
		String name="pizza";
		Food f=foodrepo.findFoodByName(name);
		System.out.println("size= "+f.toString());
	}

}
