package sg.edu.iss.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private double calorie;
	
	@ManyToMany(mappedBy="food")
	@JsonIgnore
	private List<DietPlan> dietPlan=new ArrayList<>();

	public Food() {
	}

	@OneToMany(mappedBy ="food")
	@JsonIgnore
	private List<FoodImage> foodImage;

	public Food(String name,double calorie) {
		this.name=name;
		this.calorie=calorie;
	}



}
