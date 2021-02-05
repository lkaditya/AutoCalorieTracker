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
	private String activityLevel;
	private String password;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<DailyHistory> listOfDailyHistory;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<DietPlan> listOfDietPlan;
	
	private double recommendedCalories;
		
	public User() {

	}
	
	public User(String email, String password) {
		this.email=email;
		this.password=password;
	}

	public User(String gender, int birthYear, int height, int weight, String email, String activityLevel,
			String password) {
		this(email,password);
		this.gender = gender;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;
		this.activityLevel = activityLevel;
	}

}
