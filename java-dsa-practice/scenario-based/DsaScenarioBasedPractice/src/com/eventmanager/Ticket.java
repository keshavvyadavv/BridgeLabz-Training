package com.eventmanager;
//Create Ticket that having all the details of tickets
public class Ticket {
	private int price;
	private String name;
	//constructor
	public Ticket(int price , String name) {
		this.price = price;
		this.name = name;
	}
	//getter 
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + " -> " + price;
	}
	
}
