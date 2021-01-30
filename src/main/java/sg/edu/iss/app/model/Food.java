package sg.edu.iss.app.model;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Entity

public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private double calorie;
	
	@ManyToOne
	private DietPlan dietPlan;

	public Food() {
	}

	@OneToMany(mappedBy ="food")
	private List<FoodImage> foodImage;

	public Food(String name,double calorie) {
		this.name=name;
		this.calorie=calorie;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public DietPlan getDietPlan() {
		return dietPlan;
	}

	public void setDietPlan(DietPlan dietPlan) {
		this.dietPlan = dietPlan;
	}

	public List<FoodImage> getFoodImage() {
		return foodImage;
	}

	public void setFoodImage(List<FoodImage> foodImage) {
		this.foodImage = foodImage;
	}

}
