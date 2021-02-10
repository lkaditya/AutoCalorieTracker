package sg.edu.iss.app.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import sg.edu.iss.app.model.Login;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.repo.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository userrepo;

	@Override
	public User findUserByEmail(String email) {
		return userrepo.findUserByEmail(email);
	}

	@Override
	public User findById(Long id) {
		return userrepo.findById(id).orElse(null);
	}

	@Override
	public User findUserByEmailAndPassword(String email, String password) {

		return userrepo.findUserByEmailAndPassword(email,password);
	}
	
	public int findUserIdByEmail(String email) {
		return userrepo.findUserIdByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		double cal=calculateRecommendedCalorie(user);
		user.setRecommendedCalories(cal);
		System.out.println(cal);
		userrepo.save(user);
	}

	@Override
	public void saveReminder(User user) {
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
		int BirthYear = Integer.parseInt(user.getBirthYear());
		if(user.getGender().equalsIgnoreCase("male")) {
			double BMR=10*user.getWeight()+(6.25*user.getHeight())-(5*(currentyear-BirthYear))+5;
			return BMR;
		}
		double BMR=10*user.getWeight()+(6.25*user.getHeight())-(5*(currentyear-BirthYear))-161;
		return BMR;
		
	}


	@Override
	public User validateUser(Login login) {
		User existingUser = userrepo.findUserByEmail(login.getEmail().toUpperCase());
		if(existingUser==null) {
			System.out.println("User " + login.getEmail() + " does not exist!");
			return null;
		} else if (!(existingUser.getPassword().equals(login.getPassword()))) {
			System.out.println("Stored password is " + existingUser.getPassword());
			System.out.println("Entered password is " + login.getPassword());
			System.out.println("Password for user " + login.getEmail() + " is incorrect!");
			return null;
		} else return existingUser;
	}

	@Override
	public User validateUser(User user) {
		return userrepo.findUserByEmail(user.getEmail());
	}

	@Override
	public Optional findUserByResetToken(String resetToken) {
		return userrepo.findByResetToken(resetToken);
	}

	@Override
	public void save(User user) {
		userrepo.save(user);
	}
}
