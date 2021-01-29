package sg.edu.iss.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private double calorie;
	
	@ManyToOne
	private DietPlan dietPlan;

	
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(String name,double calorie) {
		this.name=name;
		this.calorie=calorie;
	}

}
