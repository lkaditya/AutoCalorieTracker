package sg.edu.iss.app.service;


import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.Login;

import sg.edu.iss.app.model.User;

import java.util.Optional;

public interface UserService {

    User validateUser(Login login);

    User validateUser(User user);

    User findUserByEmail(String email);

	User findById(Long id);
	
	User findUserByEmailAndPassword(String email, String password);

	int findUserIdByEmail(String email);

	void saveUser(User user);

	void saveReminder(User user);

	Optional<User> findUserByResetToken(String resetToken);

	void save(User user);
}
