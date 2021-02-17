package sg.edu.iss.app.controller;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/profile/view", method = RequestMethod.GET)
    public ModelAndView Profile(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        ModelAndView view = new ModelAndView("profile");
        User user = (User)session.getAttribute("user");
//        System.out.println("user email is"+user.getEmail());
//        System.out.println("user height is " + user.getHeight());
        
        view.addObject("user", user);

        return view;
    }
    
    @RequestMapping(value = "/profile/edit/{id}")
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, HttpSession session,@PathVariable("id") Long id) {
        ModelAndView view = new ModelAndView("editProfile");
        User user = userService.findById(id);
        view.addObject("user", user);

        return view;
    }

    
    @RequestMapping(value = "/profile/save", method = RequestMethod.POST)
    public String updateProfile(@ModelAttribute("user") User user, HttpSession session, Model model) {

        userService.saveUser(user);
        user = userService.findById(user.getId());
        model.addAttribute("user",user);
        return "profile";
    }

}
