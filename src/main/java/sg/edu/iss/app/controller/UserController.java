package sg.edu.iss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/register")
    public User registerUser (@RequestBody User user){
    	userservice.saveUser(user);
    	return user;
    }


	@PostMapping("/authenticate")
    public User checkAuthentication (@RequestBody User user){
    	String email=user.getEmail();
    	String password=user.getPassword();
    	User a=userservice.findUserByEmailAndPassword(email, password);
    	if(a.getPassword().contentEquals(user.getPassword())) {
    		return a;
    	}
    	return null ;
    }

}
