package com.amazon.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.users.request.User;
import com.amazon.users.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("createUser")
	public String creteUser(@RequestBody User user) {
		int userId = userService.createUser(user);
	    	
		return "User created and user id is " + userId; // body + status code 
	}

}
