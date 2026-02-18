package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.request.ProductRequest;
import com.ecommerce.request.UserRequest;
import com.ecommerce.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
	@Autowired
	UserService userservice;

	
	//1.createusers
	@PostMapping
	public String createusers(@RequestBody UserRequest userrequest)
	{
		
		
		return userservice.createUser(userrequest);
    }
		
	
	
	//2.for login
	@PostMapping("/login")
	public String login(@RequestBody UserRequest userrequest)
	{
		 boolean success = userservice.login(userrequest);

	        return success ? "Login Successful" : "Login Failed";
		
		
		
		
	}
	
	
	
	
}
