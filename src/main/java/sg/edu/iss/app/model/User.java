package sg.edu.iss.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import sg.edu.iss.app.service.UserService;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String gender;
	private String birthYear;
	@Min(100)
	private int height;
	@Min(30)
	private int weight;
	@Email
	@NotNull
	private String email;
	private String activityLevel;
	private String password;
	private String resetPasswordToken;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<DailyHistory> listOfDailyHistory;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<DietPlan> listOfDietPlan;
	
	private double recommendedCalories;

	private double reminderCalories;
		
	public User() {

	}
	
	public User(String email, String password) {
		this.email=email;
		this.password=password;
	}

	public User(String gender, String birthYear, int height, int weight, String email, String activityLevel,
			String password) {
		this(email,password);
		this.gender = gender;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;
		this.activityLevel = activityLevel;
	}

	public User(@Email String email, double reminderCalories) {
		this.email = email;
		this.reminderCalories = reminderCalories;
	}
	
	@Override
	   public boolean equals(Object o) {
	       if (this == o) return true;
	       if (!(o instanceof User)) return false;
	     
	       User otherUser = (User) o;
	     
	       return getEmail()==otherUser.getEmail();

	   }

}

