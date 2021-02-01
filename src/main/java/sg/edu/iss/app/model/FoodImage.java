package sg.edu.iss.app.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class FoodImage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String foodName;
	private double calorie;
	private String url;		
	@ManyToOne
	private DailyHistory dailyHistory;

	@ManyToOne
	private Food food;
	
	private Long EpochTime;

}
