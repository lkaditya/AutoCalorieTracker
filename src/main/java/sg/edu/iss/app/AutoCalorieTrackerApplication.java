package sg.edu.iss.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class AutoCalorieTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCalorieTrackerApplication.class, args);
	}

}
