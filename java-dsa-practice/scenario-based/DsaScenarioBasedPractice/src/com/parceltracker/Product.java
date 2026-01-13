package com.parceltracker;
//Create Product class that create the product with orderId, customerName, and status
public class Product {
	public int orderId;
	public String customerName;
	public String currentStatus;
	
	//constructor
	public Product(int orderId , String customerName) {
		this.orderId = orderId;
		this.customerName = customerName;
	}

	//set current status
	public void setCurrentStatus(String newStatus) {
		this.currentStatus = newStatus;
	}
	
	//get current status
	public String getCurrentStatus() {
		return currentStatus;
	}
	
}
