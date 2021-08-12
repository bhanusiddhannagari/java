package com.bhanu.hbms.entities;

public class User {
	private String id;
	private String pswd;
	private String role;
	private String name;
	
	private long mbn;
	private long phn;
	private String address;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getMbn() {
		return mbn;
	}
	public void setMbn(long mbn) {
		this.mbn = mbn;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	
	
}
