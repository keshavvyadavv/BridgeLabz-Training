package com.medistore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//create a abstract class Medicine 
public abstract class Medicine implements ISellable {

	private String name;
	private double price;
	private LocalDate expiryDate;
	private int quantity;
	
	protected static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	//constructor
	public Medicine(String name, double price, String expiryDate, int quantity) {
		this.name = name;
		this.price = price;
		this.expiryDate = LocalDate.parse(expiryDate, formatter);
		this.quantity = quantity;
	}
	
	public Medicine(String name, double price, String expiryDate) {
		//contructor chaining
		this(name , price , expiryDate , 0);
	}
	//getter and setters
	public double getPrice() {return price;}
	public String getName() {return name;}
	public LocalDate getExpiryDate() {return expiryDate;}
	public int getQuantity() {return quantity;}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	//calculate price 
	double calculatePrice(int numberOfStock) {
		return price * numberOfStock;
	}
	//method for calculate discount 
	double calculatePriceWithDiscount(int numberOfItems , double discountPercent) {
		double total = calculatePrice(numberOfItems);
		return total - (total * discountPercent/100);
	}
	
	public void displayPrice(int numberOfItems) {
		double total = calculatePrice(numberOfItems);
		System.out.println("Total price for"+numberOfItems + " "+ name + " = " +total);
	}
	
}
