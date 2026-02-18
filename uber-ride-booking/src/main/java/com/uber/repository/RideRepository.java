package com.uber.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.uber.entity.Ride;

@Repository
public interface RideRepository extends CrudRepository<Ride, Long> {
	List<Ride> findByRiderId(Long riderId);
}




