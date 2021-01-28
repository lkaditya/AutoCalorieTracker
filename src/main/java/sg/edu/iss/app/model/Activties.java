package sg.edu.iss.app.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Activties {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String activtyName;
	private double caloriesBurnt;
	private ActivityLevel activityLevel;
	private ArrayList<DietPlan> dietPlans;
	
	
}
