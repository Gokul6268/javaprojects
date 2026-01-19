package com.amazon.profile.controller.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AmazonExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e, Model model) {
		model.addAttribute("errorMessage", "Unable to process you request");
		return "error";
	}

	@ExceptionHandler(ProfileAlreadyRegisteredException.class)
	public String handleException(ProfileAlreadyRegisteredException e, Model model) {
		model.addAttribute("errorMessage", "Profile is already registered! Error Code : " + e.getMessage());
		return "error";
	}
	
	

}
