package com.icecreamrush;
import java.util.*;

//create a class IceCreamRush Sorting flavors by popularity using bubble sort
public class IceCreamRush {
    //method to sort sales in ascending order
    public static void bubbleSort(int[] sales) {

        int n = sales.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sales[j] > sales[j + 1]) {
                    int temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    	
        int[] flavorSales = {45, 20, 60, 30, 10, 50, 40, 25};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(flavorSales));

        //sort using Bubble Sort
        bubbleSort(flavorSales);

        System.out.println("After sorting by popularity:");
        System.out.println(Arrays.toString(flavorSales));
    }
}
