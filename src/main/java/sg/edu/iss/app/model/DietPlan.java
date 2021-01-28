package sg.edu.iss.app.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class DietPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="dietPlan")
	private ArrayList<Food> listOfFood;
	private Date date;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Activties activty;
}
