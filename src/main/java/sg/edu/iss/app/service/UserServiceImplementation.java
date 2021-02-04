package sg.edu.iss.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
	
	public int findUserIdByEmail(String email) {
		return userrepo.findUserIdByEmail(email);
	}

}
