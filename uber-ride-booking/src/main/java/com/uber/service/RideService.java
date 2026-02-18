package com.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.uber.entity.Driver;
import com.uber.entity.Ride;
import com.uber.entity.RideStatus;
import com.uber.exception.ResourceNotFoundException;
import com.uber.repository.RideRepository;

@Service
public class RideService {
	
	@Autowired
	RideRepository Repository;
	
	public Ride bookRide(@RequestBody Ride ride) {
		
		ride.setStatus(RideStatus.REQUESTED);
		return Repository.save(ride);
	}
	
	public Ride getRide(long id) {
		return Repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ride not found"));
		
	}
	
	public Ride updateStatus(Long id, RideStatus status) {
        Ride ride = getRide(id);
        ride.setStatus(status);
        return Repository.save(ride);
    }

    public void cancelRide(Long id) {
        updateStatus(id, RideStatus.CANCELLED);
    }

    public List<Ride> getRidesByRider(Long riderid) {
    	 List<Ride> rides = Repository.findByRiderId(riderid);

         if (rides.isEmpty()) {
             throw new ResourceNotFoundException(
                 "No rides found for rider id: " + riderid
             );
         }

         return rides;
     }

}
