package sg.edu.iss.app.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String username;
	private String gender;
	private int birthYear;
	private int height;
	private int weight;
	private String email;
	private ActivityLevel activityLevel;
	private String password;
	private ArrayList<DailyHistory> listOfDailyHistory;
	private ArrayList<DietPlan> listOfDietPlan;
	private double recommendedCalories;
	private ArrayList<FoodImage> listOfFoodImage;
	
	

	public User() {
		// TODO Auto-generated constructor stub
	}

}
