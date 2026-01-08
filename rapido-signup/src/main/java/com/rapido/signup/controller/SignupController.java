package com.rapido.signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

	@RequestMapping(value = "/viewSignup", method = RequestMethod.GET)
	public ModelAndView displaySignupPage() {
		System.out.println("SignupController.displaySignupPage().....");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup");
		return modelAndView;
	}

	@PostMapping("signup")
	public ModelAndView doSignup(@RequestParam("mobile") String mobile, @RequestParam("email") String email,
			@RequestParam("name") String name) {
		System.out.println("SignupController.doSignup()");
		System.out.println(
				"Received data from client/broswer as part of form submission " + mobile + " " + email + " " + name);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("confirmation");
		return modelAndView;
	}

}
