package com.iauro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iauro.entity.Customers;
import com.iauro.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@Override
	public boolean customerPresent(String uname,String pw) {
		
		return false;
	}

	@Override
	public String registerCustomer(Customers cust) {
		
		String s=repo.save(cust).getUsername();
		
		return "Customer Signed Up Successfully with"+s;
	}

}
