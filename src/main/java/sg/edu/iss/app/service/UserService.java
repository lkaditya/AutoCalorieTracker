package sg.edu.iss.app.service;

import sg.edu.iss.app.model.Login;
import sg.edu.iss.app.model.User;

public interface UserService {


    User validateUser(Login login);

    User validateUser(User user);

    User findUserByEmail(String email);

	User findById(Long id);
	
	User findUserByEmailAndPassword(String email, String password);

	void saveUser(User user);

}
