package com.kodewala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {

	@RequestMapping("/knowStatus/{id}")
	public String status(@PathVariable("id") int id) {
		System.out.println("StatusController.status()..... id received as path vairable is " + id);
		return "statusPage";
	}

}
