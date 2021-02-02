package sg.edu.iss.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String first_name;
	private String last_name;
	private String gender;
	@Min(1900)
	private int birthYear;
	@Min(100)
	private int height;
	@Min(30)
	private int weight;
	@Email
	@NotNull
	private String email;
	//TODO:currently the activitylevel is disabled, NEED TO BE FIXED
//	private Enum<ActivityLevel> activityLevel;
	private String password;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<DailyHistory> listOfDailyHistory;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<DietPlan> listOfDietPlan;
	
	private double recommendedCalories;
		
	public User() {
		// TODO Auto-generated constructor stub
	}

}
