package sg.edu.iss.app.controller;

import org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sg.edu.iss.app.model.User;
import sg.edu.iss.app.service.MailService;
import sg.edu.iss.app.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;
import java.util.stream.IntStream;

@Controller
public class RegistrationController {
    @Autowired
    public UserService userService;

    @Autowired
    private MailService mailservice;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response){

        int[] yearArray = IntStream.rangeClosed(1960, 2021).toArray();
        String strArray[] = new String[yearArray.length];
        for (int i=0; i < yearArray.length; i++)
            strArray[i] = String.valueOf(yearArray[i]);
        ModelAndView view = new ModelAndView("register");
        view.addObject("strArray", strArray);
        view.addObject("user", new User());
        return view;
    }

//    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
//    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
//                                @ModelAttribute("user") User user) {
//        
//    	userService.saveUser(user);
//        HttpSession session = request.getSession();
//        session.setAttribute("user", user);
//        return new ModelAndView("mainPage");
//        
//​​​​
//    }
    
    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public String  addUser(HttpServletRequest request, HttpServletResponse response,
                                @ModelAttribute("user") User user,Model model) {
        User userByEmail = userService.findUserByEmail(user.getEmail());
        if(userByEmail!=null){
            model.addAttribute("message","Email have been registered ");
            return "register";
        }
        userService.saveUser(user);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        return "mainPage";
    }


    @RequestMapping("/showForgetPage")
    public String forgetPassword(Model model){
        return "forgetPassword";
    }


    @RequestMapping("/forget")
    public String sendTempPassword(@RequestParam("email")String email,Model model) {

        User user=userService.findUserByEmail(email);
        if (user==null){
            model.addAttribute("message","Email doesn't exist" );
            return "forgetPassword";
        }

        System.out.println(user.getPassword());
        UUID uuid = UUID.randomUUID();
        String tempPass="passTemp"+uuid.toString();
        user.setPassword(tempPass);
        System.out.println(user.getPassword());
        userService.saveUser(user);

        String text="Please use this temporary password to login for resetting your password \n";
        text+="email : "+email;
        text+="\n password : "+tempPass;
        //send email
        mailservice.sendSimpleMail(email, "Reset Password Query", text);

        return "login";
    }


    @RequestMapping("/showResetPage")
    public String resetPassword(Model model){
        return "resetPassword";
    }

    @RequestMapping("/reset")
    public String reset(Model model,String email,String oldPassword,String newPassword){
        User user = userService.findUserByEmail(email);
        if (user==null){
            model.addAttribute("message","Email doesn't exist");
            return "resetPassword";
        }
        String password = user.getPassword();
        if (password.equals(oldPassword)){
            user.setPassword(newPassword);
            userService.saveUser(user);
            return "login";
        }else {
            model.addAttribute("message","Wrong password");
            return "resetPassword";
        }



    }

}