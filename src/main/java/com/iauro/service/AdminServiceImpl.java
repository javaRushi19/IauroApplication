package com.iauro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iauro.entity.Admin;
import com.iauro.repo.AdminRepo;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private AdminRepo repo;
	
	@Override
	public boolean adminPresent(String uname,String pw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String registerAdmin(Admin admin) {
		String s=repo.save(admin).getAdminName();
		return "Admin Sign up with UserNmae"+s;
	}

}
