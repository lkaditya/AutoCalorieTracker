package sg.edu.iss.app.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.MailService;
import sg.edu.iss.app.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private MailService mailservice;
	
	@PostMapping("/authenticate")
    public User checkAuthentication (@RequestBody User user){
    	String email=user.getEmail();
    	String password=user.getPassword();
    	User a=userservice.findUserByEmailAndPassword(email, password);
    	if(a==null) {
        	return null ;
    	}
    	else if(a.getPassword().contentEquals(user.getPassword())) {
    		return a;
    	}
    	return null ;
    }
	
	@PostMapping("/resetPass")
    public User reset (@RequestBody User user){
    	String email=user.getEmail();
    	String password=user.getPassword();
    	User a=userservice.findUserByEmail(email);
    	a.setPassword(password);
    	userservice.saveUser(a);
    	return a ;
    }
	
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public User updateUser(@RequestBody User user) {
        User u = userservice.findUserByEmail(user.getEmail());
        u.setActivityLevel(user.getActivityLevel());
        u.setBirthYear(user.getBirthYear());
        u.setGender(user.getGender());
        u.setHeight(user.getHeight());
        u.setWeight(user.getWeight());
        userservice.saveUser(u);
        return user;
    }


    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public User ListUsers(@RequestParam("email")String email) {
        User a = userservice.findUserByEmail(email);
        return a;
    }

	@RequestMapping(value = "/viewReminder", method = RequestMethod.GET)
	public User viewReminder(@RequestParam("email")String email) {
		User a = userservice.findUserByEmail(email);
		return a;
	}

	@RequestMapping(value = "/reminder", method = RequestMethod.POST)
	public User reminder(@RequestBody User user) {
		User u = userservice.findUserByEmail(user.getEmail());
		u.setReminderCalories(user.getReminderCalories());
		userservice.saveReminder(u);
		return user;
	}

}
