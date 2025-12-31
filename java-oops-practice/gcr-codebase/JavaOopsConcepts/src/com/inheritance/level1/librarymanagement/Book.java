package com.inheritance.level1.librarymanagement;

// superclass: Book
class Book {

 String title;
 int publicationYear;
 // Constructor
 Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }
 //method to display book information
 void displayInfo() {
     System.out.println("Book Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}

