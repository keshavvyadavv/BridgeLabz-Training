package com.sortingalgorithms;

import java.util.Scanner;

public class SelectionSort {

    //Method to perform Selection Sort on an array
    public static void selectionSort(int[] scores) {

        int n = scores.length;

        //loop to move the boundary of the unsorted part
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            //  Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j; // Update index of minimum eelement
                }
            }

            //swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        //size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] examScores = new int[n];
        //Take array elements from user
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            examScores[i] = sc.nextInt();
        }
        //display array before sorting
        System.out.println("Before Sorting:");
        for (int score : examScores)
            System.out.print(score + " ");
        //call selection sort method
        selectionSort(examScores);

        // print array after sorting
        System.out.println("\nAfter Sorting:");
        for (int score : examScores)
            System.out.print(score + " ");
    }
}
