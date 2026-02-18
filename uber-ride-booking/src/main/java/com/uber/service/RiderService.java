package com.uber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.uber.entity.Driver;
import com.uber.entity.Rider;
import com.uber.exception.ResourceNotFoundException;
import com.uber.repository.RiderRepository;

@Service
public class RiderService {

	  @Autowired
      RiderRepository repository ;
	  
	  public Rider createRider(Rider rider) {
	        return repository.save(rider);
	    }
	  
	  public Rider getRider(@RequestBody Rider rider) {
		return repository.save(rider);
		  
	  }
	  
	  
	  public Rider getRider(long id) {
			return repository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Rider not found"));
			
		}
	  
	  public Rider updateRider(long id,Rider rider) {
		 Rider existing= getRider(id);
		 existing.setName(rider.getName());
		 existing.setPhonenumber(rider.getPhonenumber());
		 existing.setEmail(rider.getEmail());
		 existing.setCurrentlocation(rider.getCurrentlocation());
		 return repository.save(existing);
	  }
	  
	  public void deleteRider(long id)
	  {
		  repository.delete(getRider(id));
	  }
	  
}
