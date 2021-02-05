package sg.edu.iss.app.service;

import sg.edu.iss.app.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);

	public User findById(Long id);
	
	public User findUserByEmailAndPassword(String email, String password);

	public void saveUser(User user);

}
