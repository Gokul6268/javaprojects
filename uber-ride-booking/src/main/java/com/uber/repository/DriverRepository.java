package com.uber.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uber.entity.Driver;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {

}


