package sg.edu.iss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sg.edu.iss.app.model.Login;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showIndex(HttpServletRequest request, HttpServletResponse response){
		return showLogin(request, response);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response){
		ModelAndView view = new ModelAndView("Login");
		view.addObject("User", new User());
		return view;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request,
									 HttpServletResponse response,
									 Login login,
									 @ModelAttribute("user") User user,
									 HttpSession session){
		ModelAndView view;
		user = userService.validateUser(login);

		if (user != null) {
			view = new ModelAndView("mainPage");
			view.addObject("user", user);
			user = userService.findUserByEmail(user.getEmail());
			session.setAttribute("user", user);
		}
		else
		{
			view = new ModelAndView("login");
			view.addObject("errorMessage", "Username or Password is wrong!");
		}
		return view;
	}

	@RequestMapping(value= "logout")
		public ModelAndView logout(HttpSession session){
		session.removeAttribute("user");
		ModelAndView view = new ModelAndView("login");
		view.addObject("logoutMessage","You have successfully logged out");
		return view;
	}

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

}
