package com.amazon.user.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.user.controller.request.UserIdRequest;

@RestController // (controller + response body)
public class UserController {

	@GetMapping("generateId")
	public String generateUserID(@RequestBody UserIdRequest userIdRequest) {
		System.out.println("UserController.generateUserID()::::::");
		String firstName = userIdRequest.getFirstName();
		String lastName = userIdRequest.getLastName();
		String email = userIdRequest.getEmail();

		System.out.println("firstName " + firstName);
		System.out.println("lastName " + lastName);
		System.out.println("email " + email);

		String base = (firstName + lastName).toLowerCase().replaceAll("[^a-z]", "");
		String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);

		String userId = (base + random).substring(0, 8);

		return "Request received and you user id is : " + userId;
	}

}
