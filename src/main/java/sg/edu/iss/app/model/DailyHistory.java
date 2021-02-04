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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data

public class DailyHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private User user;
	
	
	@OneToMany(mappedBy="dailyHistory",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<FoodImage> listOfFoodImages;
	
	private LocalDate date;
	@JsonIgnore
	public DailyHistory(Long id, User user, List<FoodImage> listOfFoodImages, LocalDate date) {
		this.id = id;
		this.user = user;
		this.listOfFoodImages = listOfFoodImages;
		this.date = date;
	}

	public DailyHistory() {
	}

}
