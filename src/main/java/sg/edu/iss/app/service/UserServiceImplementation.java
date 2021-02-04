package sg.edu.iss.app.service;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void register(User user) {
		userrepo.save(user);
	}

	@Override
	public void edit(User user){
		userrepo.save(user);
	}

	@Override
	public User validateUser(Login login) {
		User existingUser = userrepo.findUserByEmail(login.getEmail());
		if(existingUser==null) {
			System.out.println("User " + login.getEmail() + " does not exist!");
			return null;
		} else if (existingUser.getPassword() != login.getPassword()) {
			System.out.println("Password for user " + login.getEmail() + " is incorrect!");
			return null;
		} else return existingUser;
	}

	@Override
	public User validateUser(User user) {
		return userrepo.findUserByEmail(user.getEmail());
	}
}
