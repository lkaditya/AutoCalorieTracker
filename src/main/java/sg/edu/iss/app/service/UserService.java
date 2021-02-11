package sg.edu.iss.app.service;


import sg.edu.iss.app.model.Login;
import sg.edu.iss.app.model.User;

public interface UserService {

    User validateUser(Login login);

    User validateUser(User user);

    User findUserByEmail(String email);

	User findById(Long id);
	
	User findUserByEmailAndPassword(String email, String password);

	int findUserIdByEmail(String email);

	void saveUser(User user);

	void saveReminder(User user);

	void save(User user);

	void updateResetPasswordToken(String token, String email) throws Exception;

	User getByResetPasswordToken(String token);

	void updatePassword(User user, String newPassword);
}
