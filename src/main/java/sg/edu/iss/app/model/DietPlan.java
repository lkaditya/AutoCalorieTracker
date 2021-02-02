package sg.edu.iss.app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class DietPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	@JsonIgnore
	private List<Food> food=new ArrayList<>();

	private LocalDate date;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Activity activity;
}
