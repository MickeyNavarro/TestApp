//Almicke Navarro 
//CST-323
//January 10, 2020 
//This is my own work.

//HomeController will deal with accessing the home page, which includes login & registration
package TestApp.TestApp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.PlayerModel;

@Controller
public class HomeController {

	//home page 
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	//login page
	@RequestMapping(value="/login", method = RequestMethod.GET) 
	public ModelAndView displayLoginPage() {
		return new ModelAndView("login", "player", new PlayerModel());
	}
	
	//registration page
	@RequestMapping(value="/register", method = RequestMethod.GET) 
	public ModelAndView displayRegistrationPage(HttpServletResponse response) throws IOException{ 
		return new ModelAndView("registration");
	}
}
