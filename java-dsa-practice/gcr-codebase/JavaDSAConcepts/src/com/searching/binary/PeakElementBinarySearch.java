package com.searching.binary;
public class PeakElementBinarySearch {

    public static int findPeakElement(int[] arr) {
    	
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);
            //check if mid is a peak
            if (leftSmaller && rightSmaller) {
                return mid;
            }
            //if left neighbor is greater, move left
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            //else move right
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    	
    	//create the array
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}