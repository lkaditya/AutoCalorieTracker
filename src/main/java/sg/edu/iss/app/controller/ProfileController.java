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
public class ProfileController {

    @Autowired
    private UserService userService;
    private Object User;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView Profile(HttpServletRequest request, HttpServletResponse response, HttpSession session, @ModelAttribute("user") User user){
        session.getAttribute("userSession");
        ModelAndView view = new ModelAndView("profile");
        System.out.println("user gender is"+user.getGender());
        System.out.println("user height is " + user.getHeight());
        view.addObject(user);
        return view;
    }

    @RequestMapping(value = "/editProfile", method = RequestMethod.POST)
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
                                @ModelAttribute("user") User user) {
        userService.edit((sg.edu.iss.app.model.User) User);
        return new ModelAndView("mainPage", "email", user.getEmail());
    }

}
