package com.amazon.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.profile.request.ProfileRequest;
import com.amazon.profile.service.ProfileService;

@Controller
public class ProfileController {

	@Autowired
	ProfileService profileService;

	@GetMapping("viewProfile")
	public String viewProfilePage() {
		System.out.println("ProfileController.viewProfilePage() ");
		return "profile";
	}

	@PostMapping("createProfile")
	public String createProfile(@ModelAttribute ProfileRequest profileRequest) {
		System.out.println("ProfileController.createProfile():::::::::: " + profileRequest.getEmail());
		// calling the service layer...
		int id = profileService.createProfile(profileRequest);
		System.out.println(" Proile created and id is " + id);
		return "profile-confirmation";
	}

}
