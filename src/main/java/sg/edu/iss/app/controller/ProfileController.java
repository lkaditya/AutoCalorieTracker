package sg.edu.iss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sg.edu.iss.app.model.Login;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ProfileController {

    @Autowired
    private UserService userService;
    private Object User;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String Profile(User user ){
        String name = user.getEmail();
        user = userService.findUserByEmail(name);
        return "profile";
    }

}
