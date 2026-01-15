package com.zipzipmart;
//Create the Transaction class that having the details of transactions
public class Transaction {
	 private String date;
	 private int amount;
	//constructor
	public Transaction(String date , int amount) {
		this.date = date;
		this.amount = amount;
	}
	//getter
	public String getDate() {
		return date;
	}
	//setter
	public int getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return date + " -> " + amount;
	}
	
}
