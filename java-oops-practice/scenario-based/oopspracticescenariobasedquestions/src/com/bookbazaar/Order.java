package com.bookbazaar;

public class Order {
	private int orderId;
	private String status;
	private int userId;
	private Book book;
	private int quantity;
	
	public Order(int orderId, int userId) {
		this.orderId = orderId;
		this.userId = userId;
		this.status = "CREATED";
	}
	public void addBook(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
		book.updateStock(quantity);
	}
	public double calculateTotal(){
		double discount = book.applyDiscount(orderId, quantity);
		return (book.getPrice() * quantity) - discount;
	}
	public void updateStatus(String status) {
		this.status = status ;
	}
	public String getStatus() {
		return status;
	}
}
