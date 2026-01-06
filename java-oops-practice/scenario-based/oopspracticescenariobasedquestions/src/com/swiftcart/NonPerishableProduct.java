package com.swiftcart;

public class NonPerishableProduct extends Product {
	public NonPerishableProduct(String name, double price, String category, int quantity) {
		super(name, price, category, quantity);
	}

	// Lower discount for non-perishable items
	public double applyDiscount(double total) {
		return total * 0.05; // 5% discount
	}
}