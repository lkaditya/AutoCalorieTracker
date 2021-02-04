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


	@PostMapping("/authenticate")
    public User checkAuthentication (@RequestBody User user){
    	String email=user.getEmail();
    	String password=user.getPassword();
    	User a=userservice.findUserByEmailAndPassword(email, password);
    	return a ;
    }

}
