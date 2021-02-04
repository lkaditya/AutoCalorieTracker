package sg.edu.iss.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String password) {
		this.email=email;
		this.password=password;
	}

}
