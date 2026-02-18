
package com.uber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uber.entity.Ride;
import com.uber.entity.RideStatus;
import com.uber.service.RideService;


@RestController
@RequestMapping("/rides")
public class RideController {
	
	@Autowired
	RideService service; 
	
	@PostMapping
	public Ride book(@RequestBody Ride ride)
	{
		return service.bookRide(ride);
		
	}
	
	@GetMapping("/{id}")
	public Ride get(@PathVariable long id) {
		return service.getRide(id);
		
	}
	
	@PutMapping("/{id}/status")
	public Ride updateStatus(@PathVariable long id,@RequestParam RideStatus rideStatus) {
		return service.updateStatus(id, rideStatus);
		
	}
	
	@DeleteMapping("/{id}")
	public void cancel(@PathVariable long id) {
		service.cancelRide(id);
	}
	
	@GetMapping("/rider/{riderid}")
	public List<Ride> getByRider(@PathVariable("riderid") long riderId) {
	    return service.getRidesByRider(riderId);
	}
	
//	@GetMapping("/check/{riderId}")
//	public String check(@PathVariable("riderId") long riderId) {
//	    return "OK " + riderId;
//	}



}