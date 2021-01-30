package sg.edu.iss.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String gender;
	private int birthYear;
	private int height;
	private int weight;
	private String email;
//	private Enum<ActivityLevel> activityLevel;
	private String password;
	
	@OneToMany(mappedBy="user")
	private List<DailyHistory> listOfDailyHistory;
	
	@OneToMany(mappedBy="user")
	private List<DietPlan> listOfDietPlan;
	
	private double recommendedCalories;
	
	@OneToMany(mappedBy="user")
	private List<FoodImage> listOfFoodImage;
	
	

	public User() {
		// TODO Auto-generated constructor stub
	}

}
