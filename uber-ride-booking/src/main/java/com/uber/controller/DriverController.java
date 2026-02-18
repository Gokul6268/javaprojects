package com.uber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.entity.Driver;
import com.uber.service.DriverService;


@RestController
@RequestMapping("/drivers")
public class DriverController {
	
	@Autowired
	DriverService service;
	
	
	@PostMapping
	public Driver register(@RequestBody Driver driver) {
		return service.registerDriver(driver);
		
	}
	
	@PutMapping("/{id}/availability")
	public Driver updateAvailability(@PathVariable long id,@RequestBody boolean available) {
		return service.updateAvailability(id, available);
		
	}

	@GetMapping("/{id}")
	public Driver get(@PathVariable long id) {
		return service.getDriver(id);
		
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable long id) {
		service.deleteDriver(id);
	}
}
