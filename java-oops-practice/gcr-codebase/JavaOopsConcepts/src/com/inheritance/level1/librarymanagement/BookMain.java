package com.inheritance.level1.librarymanagement;

//main class to test the program.
public class BookMain {
public static void main(String[] args) {
   //create an Author object
   Author book1 = new Author(
       "The Learning Journey",
       2023,
       "Amit Sharma",
       "An author who writes educational books."
   );

   // Display full information
   book1.displayInfo();
}
}
