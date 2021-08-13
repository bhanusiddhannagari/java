package com.bhanu.airline.entities;

public class Booking {
	private String Booking_id;
	private String cust_email;
	private int	   no_of_passengers;
	private String class_type;
	private double total_fare;
	private String seat_number;
	private String CreditCard_info;
	private String src_city;
	private String dest_city;
	public String getBooking_id() {
		return Booking_id;
	}
	public void setBooking_id(String booking_id) {
		Booking_id = booking_id;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public int getNo_of_passengers() {
		return no_of_passengers;
	}
	public void setNo_of_passengers(int no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
	public double getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(double total_fare) {
		this.total_fare = total_fare;
	}
	public String getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(String seat_number) {
		this.seat_number = seat_number;
	}
	public String getCreditCard_info() {
		return CreditCard_info;
	}
	public void setCreditCard_info(String creditCard_info) {
		CreditCard_info = creditCard_info;
	}
	public String getSrc_city() {
		return src_city;
	}
	public void setSrc_city(String src_city) {
		this.src_city = src_city;
	}
	public String getDest_city() {
		return dest_city;
	}
	public void setDest_city(String dest_city) {
		this.dest_city = dest_city;
	}
	
	
	
}
