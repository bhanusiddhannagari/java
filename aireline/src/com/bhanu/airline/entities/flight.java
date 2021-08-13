package com.bhanu.airline.entities;

import java.util.Date;

public class flight {
	private String flightno;
	private String airline;
	private String dep_city;
	private String arr_city;
	private Date dep_date;
	private Date arr_date;
	private String arr_time;
	private String dep_time;
	private int 	fcs;
	private double	fcsf;
	private int 	bcs;
	private double 	bcsf;
	public String getFlightno() {
		return flightno;
	}
	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDep_city() {
		return dep_city;
	}
	public void setDep_city(String dep_city) {
		this.dep_city = dep_city;
	}
	public String getArr_city() {
		return arr_city;
	}
	public void setArr_city(String arr_city) {
		this.arr_city = arr_city;
	}
	public Date getDep_date() {
		return dep_date;
	}
	public void setDep_date(Date dep_date) {
		this.dep_date = dep_date;
	}
	public Date getArr_date() {
		return arr_date;
	}
	public void setArr_date(Date arr_date) {
		this.arr_date = arr_date;
	}
	public String getArr_time() {
		return arr_time;
	}
	public void setArr_time(String arr_time) {
		this.arr_time = arr_time;
	}
	public String getDep_time() {
		return dep_time;
	}
	public void setDep_time(String dep_time) {
		this.dep_time = dep_time;
	}
	public int getFcs() {
		return fcs;
	}
	public void setFcs(int fcs) {
		this.fcs = fcs;
	}
	public double getFcsf() {
		return fcsf;
	}
	public void setFcsf(int fcsf) {
		this.fcsf = fcsf;
	}
	public int getBcs() {
		return bcs;
	}
	public void setBcs(int bcs) {
		this.bcs = bcs;
	}
	public double getBcsf() {
		return bcsf;
	}
	public void setBcsf(int bcsf) {
		this.bcsf = bcsf;
	}
	

}
