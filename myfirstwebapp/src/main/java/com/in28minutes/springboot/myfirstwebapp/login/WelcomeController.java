package com.in28minutes.springboot.myfirstwebapp.login;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Model allows to pass query parameters do the jsp (view)
 * In jsp file you can use ${} syntax in order to use the value
 */

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}

	private String getLoggedinUsername() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
//	@RequestMapping(value="login", method=RequestMethod.POST)
//	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		
//		if (authenticationService.authenticate(name, password)) {
//			model.put("name", name);
//			
//			return "welcome";
//		} else {
//			
//			model.put("errorMessage","Invalid Credentials, please try again");
//			
//			return "login";
//		}
//		
//	}
}
