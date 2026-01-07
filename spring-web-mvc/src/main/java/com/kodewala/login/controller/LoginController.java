package com.kodewala.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("displayLogin")
	public ModelAndView displayLogin() {
		System.out.println("LoginController.displayLogin().....");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login-page"); // response will be sent to this page
		return mv;
	}
	
	
	
	@RequestMapping("logout")
	public ModelAndView logout() {
		System.out.println("LoginController.logout()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("logout");
		return mv;
	}
	
	@RequestMapping("resetPwd")
	public ModelAndView resetPassword() {
		System.out.println("LoginController.resetPassword()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resetPwdPage");
		return mv;
	}
}
