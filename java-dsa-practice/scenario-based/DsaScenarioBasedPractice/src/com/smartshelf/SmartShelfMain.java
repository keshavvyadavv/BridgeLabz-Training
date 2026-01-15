package com.smartshelf;
import java.util.Arrays;

public class SmartShelfMain {

    public static void sortBooks(User user) {
        //convert List to Array
        String[] books = user.getBookList().toArray(new String[0]);

        // insertion sort
        for (int i = 1; i < books.length; i++) {
            String key = books[i];
            int j = i - 1;
            while (j >= 0 && books[j].compareTo(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
        //update user's book list
        user.setBookList(Arrays.asList(books));
    }

    public static void main(String[] args) {

    	//create the user
        User user1 = new User("abhi");
        user1.addBook("Dr. ABCD");
        user1.addBook("Rings of fire");
        user1.addBook("Eat that frog");
        System.out.println("Before sorting:");
        user1.displayBookList();
        sortBooks(user1);

        System.out.println("After sorting:");
        user1.displayBookList();
    }
}
