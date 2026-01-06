package com.sortingalgorithms;

import java.util.Scanner;

public class CountingSort {
	
    //method to perform Counting Sort
    public static void countingSort(int[] ages) {

        int minAge = 10;
        int maxAge = 18;
        //calculate range of ages
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        // Output array to store sorted values
        int[] output = new int[ages.length];
        // Step 1:count frequency of each age
        for (int age : ages) {
            count[age - minAge]++; 
        }
        for (int i = 1; i < range; i++) {
            count[i] = count[i] + count[i - 1];
        }
        // Step 3:place elements into output array
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }
        // Step 4:copy sorted elements back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] studentAges = new int[n];
        System.out.println("Enter ages between 10 and 18: ");
        for (int i = 0; i < n; i++) {
            studentAges[i] = sc.nextInt();
        }
        // print array before sorting
        System.out.println("Before Sorting:");
        for (int age : studentAges)
            System.out.print(age + " ");
        // Call counting sort method
        countingSort(studentAges);
        // print array after sorting
        System.out.println("\nAfter Sorting:");
        for (int age : studentAges)
            System.out.print(age + " ");
    }
}
