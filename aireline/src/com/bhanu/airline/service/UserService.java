package com.bhanu.airline.service;

import com.bhanu.airline.entities.*;

public class UserService {
	public void signup (String name , String email , long mbno, String pswd, String role )
	{
		User u1 = new User();
		u1.setName(name);
		System.out.println(u1.getName());
	}
}
