package sg.edu.iss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sg.edu.iss.app.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response){
		ModelAndView view = new ModelAndView("Login");
		view.addObject("Login", new Login());
		return view;
	}

	@RequestMapping(value = "loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request,
									 HttpServletResponse response,
									 @ModelAttribute("login") Login login){
		ModelAndView view = null;
		User user = userService.validateUser(login);

		if (user != null) {
			view = new ModelAndView("welcome");
			view.addObject("username", user.getusername());
		}
		else
		{
			view = new ModelAndView("login");
			view.addObject("message", "Username or Password is wrong!");
		}
		return view;
	}

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

}
