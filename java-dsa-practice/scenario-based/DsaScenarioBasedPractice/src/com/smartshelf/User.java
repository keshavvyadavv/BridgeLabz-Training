package com.smartshelf;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> bookList;
    public User(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }
    public void addBook(String book) {
        bookList.add(book);
    }
    //getter
    public List<String> getBookList() {
        return new ArrayList<>(bookList);
    }
    //setter
    public void setBookList(List<String> bookList) {
        this.bookList = new ArrayList<>(bookList);
    }
    public void displayBookList() {
        System.out.println("Book List:");
        for (String book : bookList) {
            System.out.print(book + " | ");
        }
        System.out.println();
    }
}
