package com.ambulanceroute;

public class HospitalUnit {
	String unitName;
	boolean available;
	HospitalUnit next;
	
	//constructor
	HospitalUnit(String unitName , boolean available){
		this.unitName = unitName;
		this.available = available;
	}
}
