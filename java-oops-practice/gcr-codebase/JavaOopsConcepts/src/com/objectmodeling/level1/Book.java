package com.objectmodeling.level1;

public class Book{
	private String title;
	private String author;
	
	public Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	
	public static void main(String[] args) {
		
		Library l = new Library();
		Library l2 = new Library();
		Book b1 = new Book("java programming" , "rajneesh");
		Book b2 = new Book("python programming" , "ravi");
		l.addBooks(b1);
		l2.addBooks(b2);
		l.sowAllBook();
		System.out.println("library 2");
		l2.sowAllBook();
		
	}
}