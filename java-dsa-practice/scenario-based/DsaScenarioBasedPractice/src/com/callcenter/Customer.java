package com.callcenter;

public class Customer {
	String customerId;
	String name;
	boolean isVIP;
	
	Customer(String customerId , String name , boolean isVIP){
		this.customerId = customerId;
		this.name = name;
		this.isVIP = isVIP;
	}
	
	public String toString() {
		return name + " (ID: " + customerId + ", VIP: "+isVIP + ")";
	}
}
