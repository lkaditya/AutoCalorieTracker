package sg.edu.iss.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sg.edu.iss.app.model.Login;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.MyUserPrincipal;
import sg.edu.iss.app.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView showIndex(Authentication auth, HttpSession session){
		if(auth==null) return new ModelAndView("redirect:login");
		else {
			MyUserPrincipal principal = (MyUserPrincipal)(auth.getPrincipal());
			User user = principal.getUser();
			if(user==null) {
				System.err.println("User is null!");
				return new ModelAndView("redirect:login");
			} else {
				System.out.println("Obtained details for " + user.getEmail());
				ModelAndView view = new ModelAndView("mainPage");
				view.addObject("user", user);
				//user = userService.findUserByEmail(user.getEmail());
				session.setAttribute("user", user);
				return view;
			}			
		}		
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response){
		ModelAndView view = new ModelAndView("login");
		view.addObject("User", new User());
		return view;
	}

	@RequestMapping(value= "logout")
		public ModelAndView logout(HttpSession session){
		session.removeAttribute("user");
		ModelAndView view = new ModelAndView("login");
		view.addObject("logoutMessage","You have successfully logged out");
		return view;
	}
}
