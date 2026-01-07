package com.searching.binary;
public class FirstLastOccurrenceBinarySearch {

    // Find first occurrence of target
    public static int findFirstOccurrence(int[] arr, int target) {
    	
        int left = 0;
        int right =  arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid]  == target) {
                result = mid;       // possible answer
                right = mid - 1;    // move left
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1 ;
            }
        }
        return result;
    }

    // Find last occurrence of target
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length  - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;      
                left = mid + 1;    
            } 
            else if ( arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    	
    	//create array and set target
        int[] arr = {1, 2, 2 , 2, 3, 4, 5};
        int target = 2;

        //call 
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        //display result
        System.out.println("first occurrence index: " + first);
        System.out.println("Last occurrence index: " + last);
    }
}