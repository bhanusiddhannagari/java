package com.bhanu.hbms.test;

import com.bhanu.hbms.service.Signup;

public class apptest {
	public static void main(String[] args) {
		Signup s = new Signup();
		s.signup("bhanu","hyd", "bhanu@gmail.com",  9553859736l);
	}
}
