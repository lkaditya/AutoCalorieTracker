package sg.edu.iss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userservice;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        userservice.saveUser(user);
        return user;
    }


    @PostMapping("/authenticate")
    public User checkAuthentication(@RequestBody User user) {
        String email = user.getEmail();
        String password = user.getPassword();
        User a = userservice.findUserByEmailAndPassword(email, password);
        if (a.getPassword().contentEquals(user.getPassword())) {
            return a;
        }
        return null;
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
}
