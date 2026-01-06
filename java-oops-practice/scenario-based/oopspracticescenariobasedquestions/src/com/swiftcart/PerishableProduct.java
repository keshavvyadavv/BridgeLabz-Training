package com.swiftcart;

//Perishable products like fruits, vegetables, dairy
public class PerishableProduct extends Product {
	public PerishableProduct(String name, double price, String category, int quantity) {
		super(name, price, category, quantity);
	}


	public double applyDiscount(double total) {
		return total * 0.10; 
	}
	
}