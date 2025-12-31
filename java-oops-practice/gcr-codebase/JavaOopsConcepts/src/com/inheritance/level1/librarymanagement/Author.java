package com.inheritance.level1.librarymanagement;

//subclass: Author
public class Author extends Book {
// Additional attributes for Author
String name;
String bio;

// Constructor for Author
Author(String title, int publicationYear, String name, String bio) {
   //call the superclass constructor
   super(title, publicationYear);
   this.name = name;
   this.bio = bio;
}
// Method to display book and author information
void displayInfo() {
   // display book details
   super.displayInfo();

   // Display author details
   System.out.println("Author Name: " + name);
   System.out.println("Author Bio: " + bio);
}
}

