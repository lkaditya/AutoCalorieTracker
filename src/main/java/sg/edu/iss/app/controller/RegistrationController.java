package sg.edu.iss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class RegistrationController {
    @Autowired
    public UserService userService;
    private Object User;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response){
        ModelAndView view = new ModelAndView("register");
        view.addObject("user", new User());
        return view;
    }

    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
                                @ModelAttribute("user") User user) {
        userService.saveUser(user);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        return new ModelAndView("mainPage");
    }
}