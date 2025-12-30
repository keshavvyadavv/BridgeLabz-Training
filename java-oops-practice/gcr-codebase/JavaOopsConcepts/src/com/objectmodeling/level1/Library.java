package com.objectmodeling.level1;
import java.util.ArrayList;
import java.util.List;


public class Library {
	private List<Book> enrollededBooks;
	
	public Library(){
		this.enrollededBooks = new ArrayList<>();
	}
	public void addBooks(Book book){
		enrollededBooks.add(book);
		System.out.println("book "+book.getTitle() + " is added.");
	}
	public void sowAllBook(){
		for(Book book : enrollededBooks){
			System.out.println(book.getTitle());
		}
	}
}
