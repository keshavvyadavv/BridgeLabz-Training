package com.smartlibrary;

import java.util.*;

// class that SmartLibrary that auto-sorting borrowed books using insertion Sort
public class SmartLibrary {
    public static void insertionSort(String[] books) {

        int n = books.length;
        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;
            while (j >= 0 && books[j].compareTo(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        String[] borrowedBooks = {"algorithms","Data Structures","operating Systems","computer Networks","database Systems"};
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(borrowedBooks));

        insertionSort(borrowedBooks);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(borrowedBooks));
    }
}
