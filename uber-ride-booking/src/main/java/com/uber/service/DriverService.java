package com.uber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.entity.Driver;
import com.uber.exception.ResourceNotFoundException;
import com.uber.repository.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	DriverRepository Repository;
	
	public Driver registerDriver(Driver driver) {
		return Repository.save(driver);
		
	}
	
	public Driver getDriver(long id) {
		return Repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Driver not found"));
		
	}
	
	public Driver updateAvailability(long id,boolean availability) {
		
		Driver driver=getDriver(id);
		driver.setAvailability(availability);
		return Repository.save(driver);
		
	}
	
	public void deleteDriver(long id) {
		
		Repository.delete(getDriver(id));
	}

}
