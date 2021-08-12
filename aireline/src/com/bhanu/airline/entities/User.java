package com.bhanu.airline.entities;
		
public class User {
	private String uid;
	private String name;
	private String email;
	private long   mbno;
	private String pswd;
	private String role;
	
	
	
	public void setUid(String uid) {
		if (uid == null) {
			this.uid = uid;
		}
		else 
		{
			System.out.println("invalied operation");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
