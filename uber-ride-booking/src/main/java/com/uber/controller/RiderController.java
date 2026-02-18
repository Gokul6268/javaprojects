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

import com.uber.entity.Rider;
import com.uber.service.RiderService;

@RestController
@RequestMapping("/riders")
public class RiderController {

	@Autowired
	RiderService service;
	
	@PostMapping
	public Rider create(@RequestBody Rider rider)
	{
		return service.createRider(rider);
		
	}
	
	@GetMapping("/{id}")
	public Rider get(@PathVariable long id) {
		return service.getRider(id);
		
	}
	
	@PutMapping("/{id}")
	public Rider update(@PathVariable long id,@RequestBody Rider rider) {
		return service.updateRider(id, rider);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		service.deleteRider(id);
	}
}
