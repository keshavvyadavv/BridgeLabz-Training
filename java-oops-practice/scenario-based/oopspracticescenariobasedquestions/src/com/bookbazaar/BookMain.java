package com.bookbazaar;

public class BookMain {
	public static void main(String[] args) {
		
		User user = new User("ravi", "ravi@mail.com");
		Book ebook = new EBook("java programming", "rama rao", 500, 10);
		Book printedBook = new PrintedBook("oop concepts" , "balagurusamy", 800, 5);
		
		Order order1 = new Order(101, 1);
		
		order1.addBook(ebook, 2);
		
		double totalAmount = order1.calculateTotal();
		System.out.println("Total Amount: Rs. "+totalAmount);
		
		System.out.println("Order status: "+order1.getStatus());
	}
}
