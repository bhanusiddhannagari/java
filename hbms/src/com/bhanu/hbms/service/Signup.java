package com.bhanu.hbms.service;


import com.bhanu.hbms.entities.User;

public class Signup {
	public  void signup(String name,String address,String email,long mbn )
	{
		User u = new User();
		u.setName(name);
		System.out.println("name.......:"+u.getName());
		
		u.setAddress(address);
		System.out.println("address....:"+u.getAddress());
		u.setEmail(email);
		System.out.println("email......:"+u.getEmail());
		u.setMbn(mbn);
		System.out.println("mbn........:"+u.getMbn());
	}

}
