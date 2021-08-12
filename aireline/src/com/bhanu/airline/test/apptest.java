package com.bhanu.airline.test;
import com.bhanu.airline.service.*;

public class apptest {
	public static void main(String[] args) {
		UserService us1 = new UserService();
		us1.signup("bhanu", "bhanu@gmail.com", 98598598, "bhasv", "user");
		
	}

}
