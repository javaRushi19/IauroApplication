package com.iauro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iauro.entity.Admin;
import com.iauro.entity.Customers;

public interface CustomerRepo extends JpaRepository<Customers, Integer> {

	
	  @Query("from  Customers  where USERNAME=:name and PASSWORD=:password")  //assuming movie names are unique name
		public Customers  fetchCustomerByUserNameAndPassword(String name,String password);
	
}
