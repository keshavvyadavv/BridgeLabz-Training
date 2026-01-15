package com.hospitalqueue;
//create the patient class having detailes about patient
public class Patient {
	String name;
	int criticality;// 1 - 10 levels 1 = low , 10 = high
	
	public Patient(String name , int criticality) {
		this.name = name;
		this.criticality = criticality;
	}
	
	public void display() {
		System.out.println("Name of the patient is " + name + " criticality level is "+criticality);
	}
}
