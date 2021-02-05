package sg.edu.iss.app.service;

import sg.edu.iss.app.model.Login;
import sg.edu.iss.app.model.User;

public interface UserService {

    void register(User user);

    void edit(User user);

    User validateUser(Login login);

    User validateUser(User user);

    User findUserByEmail(String email);
	
	User findUserByEmailAndPassword(String email, String password);

	void saveUser(User user);

    User findById(long l);
}
