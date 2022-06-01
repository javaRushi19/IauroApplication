package com.iauro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iauro.entity.Admin;


public interface AdminRepo extends JpaRepository<Admin, Integer> {

	  @Query("from  Admin  where USERNAME=:name and PASSWORD=:password")  //assuming movie names are unique name
	public Admin  fetchAdminByUserNameAndPassword(String name,String password);
	
}
