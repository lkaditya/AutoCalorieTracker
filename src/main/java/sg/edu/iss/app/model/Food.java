package sg.edu.iss.app.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private double calorie;
	
	@ManyToMany
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
