package com.bookbazaar;

public abstract class Book implements IDiscountable{
	private String title;
	private String author;
	private double price;
	private int stock;

	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
//	public Book(String title, String author, double price, int stock, double offer) {
//		super();
//		this.title = title;
//		this.author = author;
//		this.price = price;
//		this.stock = stock;
//	}
	
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public void updateStock(int quantity) {
		if(quantity<= stock) {
			stock -= quantity;
		}
	}
}
