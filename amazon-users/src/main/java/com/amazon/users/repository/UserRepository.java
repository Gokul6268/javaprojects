package com.amazon.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.users.UserEntity;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Integer>
{
	// Derived Query 
	
     public UserEntity getUserByFirstName(String firstName);
     // Select * from users where first_name=?
}
