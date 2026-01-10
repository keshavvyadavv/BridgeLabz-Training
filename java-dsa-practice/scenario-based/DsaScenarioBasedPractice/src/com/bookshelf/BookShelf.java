package com.bookshelf;

import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class BookShelf {

    // Logic for borrowing (removing) a book
    public static void borrowBook(Map<String, LinkedList<String>> map, String genre, String bookName, Set<String> uniqueBook) {
        if (map.containsKey(genre)) {
            LinkedList<String> books = map.get(genre);
            if (books.remove(bookName)) { 
                uniqueBook.remove(bookName); 
                
                System.out.println("success: You have borrowed '" + bookName + "'");
            } else {
                System.out.println("error: Book '" + bookName + "' not found in the " + genre + " section.");
            }
        } else {
            System.out.println("error: Genre '" + genre + "' does not exist.");
        }
        
    }

    public static void main(String[] args) {
    	
    	//create the input object
        Scanner input = new Scanner(System.in);
        Map<String, LinkedList<String>> map = new HashMap<>();
        Set<String> uniqueBook = new HashSet<>();

        // setup the Library
        System.out.print("Enter the number of genres to add: ");
        int numGenres = input.nextInt();
        input.nextLine(); //consume newline

        for (int i = 0; i < numGenres; i++) {
            System.out.print("\nEnter genre name (e.g., Fiction, Sci-Fi): ");
            String genreName = input.nextLine();

            LinkedList<String> bookList = new LinkedList<>();
            System.out.print("Enter the number of books in " + genreName + ": ");
            int numberOfBooks = input.nextInt();
            input.nextLine(); //consume newline

            for (int j = 0; j < numberOfBooks; j++) {
                System.out.print("Enter book name " + (j + 1) + ": ");
                String bookName = input.nextLine();

                if (uniqueBook.contains(bookName)) {
                    System.out.println("-> Skipping: '" + bookName + "' already exists in the library.");
                } else {
                    bookList.add(bookName);
                    uniqueBook.add(bookName);
                }
            }
            
            map.put(genreName, bookList);
        }

        //Display 
        System.out.println("\n--- Final Library Catalog ---");
        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()) {
            System.out.println("Genre: [" + entry.getKey() + "] | Books: " + entry.getValue());
        }

        System.out.println("\n--- Borrow a Book ---");
        System.out.print("Enter genre to borrow from: ");
        String bGenre = input.nextLine();
        System.out.print("Enter book name to borrow: ");
        String bName = input.nextLine();
        borrowBook(map, bGenre, bName, uniqueBook);
        //show updated catalog
        System.out.println("\nUpdated Catalog: " + map);

        input.close();
    }
}