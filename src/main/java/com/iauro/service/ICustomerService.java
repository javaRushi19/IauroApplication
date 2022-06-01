package com.iauro.service;

import com.iauro.entity.Customers;

public interface ICustomerService {
	
	public boolean customerPresent(String uname,String pw);
	 public  String  registerCustomer(Customers cust);

}
