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
		return userrepo.findUserByemail(email);
	}

	@Override
	public void register(User user) {
		userrepo.save(user);
	}

	@Override
	public User validateUser(Login login) {
		return userrepo.findUserByemail(login.getEmail());
	}

}
