package sg.edu.iss.app.service;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.repo.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository userrepo;

	@Override
	public User findUserByEmail(String email) {
		return userrepo.findUserByemail(email);
	}

	@Override
	public User findById(Long id) {
		User user = userrepo.findById(id).orElse(null);
		return user;
	}

	@Override
	public User findUserByEmailAndPassword(String email, String password) {
		return userrepo.findUserByemailAndPassword(email,password);
	}

	@Override
	public void saveUser(User user) {
		double cal=calculateRecommendedCalorie(user);
		user.setRecommendedCalories(cal);
		System.out.println(cal);
		userrepo.save(user);
	}
	
	public double calculateRecommendedCalorie(User user) {
		double BMR=calculateBMR(user);
		if(user.getActivityLevel().equalsIgnoreCase("sedentary")) {
			return BMR*1.2;
		}else if(user.getActivityLevel().equalsIgnoreCase("moderate")) {
			return BMR*1.375;
		}else {
			return BMR*1.55;
		}
	}
	
	public double calculateBMR(User user) {
		int currentyear=LocalDate.now().getYear();
		if(user.getGender().equalsIgnoreCase("male")) {
			double BMR=10*user.getWeight()+(6.25*user.getHeight())-(5*(currentyear-user.getBirthYear()))+5;
			return BMR;
		}
		double BMR=10*user.getWeight()+(6.25*user.getHeight())-(5*(currentyear-user.getBirthYear()))-161;
		return BMR;
		
	}

}
