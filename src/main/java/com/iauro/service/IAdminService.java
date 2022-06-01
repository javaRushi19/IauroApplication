package com.iauro.service;

import com.iauro.entity.Admin;


public interface IAdminService {

		public boolean adminPresent(String username,String password);
	 public  String  registerAdmin(Admin admin);
	
	
	
}
