package com.artify;

//Create User class 
public class User {
	private String name;
	private double walletBalance;
	
	//constructor, getter and setters
	public User(String name , double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	protected void setBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	protected double getBalance() {
		return walletBalance;
	}
}
