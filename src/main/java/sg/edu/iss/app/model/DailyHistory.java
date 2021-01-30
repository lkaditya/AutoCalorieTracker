package sg.edu.iss.app.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity

public class DailyHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy="dailyHistory")
	private List<FoodImage> listOfFoodImages;
	
	private LocalDate date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DailyHistory(Long id, User user, List<FoodImage> listOfFoodImages, LocalDate date) {
		this.id = id;
		this.user = user;
		this.listOfFoodImages = listOfFoodImages;
		this.date = date;
	}

	public DailyHistory() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<FoodImage> getListOfFoodImages() {
		return listOfFoodImages;
	}

	public void setListOfFoodImages(List<FoodImage> listOfFoodImages) {
		this.listOfFoodImages = listOfFoodImages;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
