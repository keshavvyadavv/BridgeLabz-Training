package com.algorithmruntimeanalysis;

import java.util.Arrays;
import java.util.Scanner;

public class SortingPerformanceComparison {

	// Bubble Sort Algorithm Worst & Average Case Time Complexity: O(n²)
	public static void bubbleSort(int[] array) {
		int length = array.length;
		boolean isSwapped;
		// Outer loop for number of passes
		for (int i = 0; i < length - 1; i++) {
			isSwapped = false;
			// Inner loop for comparing adjacent elements
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {

					// Swap if elements are in wrong order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isSwapped = true;
				}
			}

			//stop early if no swaps occurred in this pass
			if (!isSwapped) {
				break;
			}
		}
	}

	//merge Sort - Merge (Conquer) Step Time Complexity: O(n)
	public static void conquer(int[] array, int startIndex, int midIndex, int endIndex) {

		//temporary array to store merged elements
		int[] mergedArray = new int[endIndex - startIndex + 1];
		int leftIndex = startIndex;
		int rightIndex = midIndex + 1;
		int mergedIndex = 0;
		//compare elements from both halves and merge
		while (leftIndex <= midIndex && rightIndex <= endIndex) {
			if (array[leftIndex] <= array[rightIndex]) {
				mergedArray[mergedIndex++] = array[leftIndex++];
			} else {
				mergedArray[mergedIndex++] = array[rightIndex++];
			}
		}
		//copy remaining elements from left half
		while (leftIndex <= midIndex) {
			mergedArray[mergedIndex++] = array[leftIndex++];
		}
		// copy remaining elements from right half
		while (rightIndex <= endIndex) {
			mergedArray[mergedIndex++] = array[rightIndex++];
		}
		// copy merged result back into original array
		for (int i = 0, j = startIndex; i < mergedArray.length; i++, j++) {
			array[j] = mergedArray[i];
		}
	}
	// merge Sort - Divide Step
	// Recursively divides the array into smaller parts
	public static void divide(int[] array, int startIndex, int endIndex) {

		// Base condition for recursion
		if (startIndex >= endIndex) {
			return;
		}

		// Find middle index
		int midIndex = startIndex + (endIndex - startIndex) / 2;

		// Recursively divide left and right halves
		divide(array, startIndex, midIndex);
		divide(array, midIndex + 1, endIndex);

		// Merge sorted halves
		conquer(array, startIndex, midIndex, endIndex);
	}

	// Quick Sort Partition Method
	// Places pivot element at correct position
	public static int partition(int[] array, int lowIndex, int highIndex) {

		// Choosing last element as pivot
		int pivot = array[highIndex];
		int i = lowIndex - 1;

		// Rearranging elements around pivot
		for (int j = lowIndex; j < highIndex; j++) {
			if (array[j] < pivot) {
				i++;

				// Swap smaller element to left
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// Place pivot at correct position
		i++;
		int temp = array[i];
		array[i] = pivot;
		array[highIndex] = temp;

		return i;
	}

	// Quick Sort Algorithm average Time Complexity: O(n log n) worst Case Time Complexity: O(n²)
	public static void quickSort(int[] array, int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			// partitioning index
			int pivotIndex = partition(array, lowIndex, highIndex);
			// recursive calls for left and right subarrays
			quickSort(array, lowIndex, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, highIndex);
		}
	}

	// main Method - Execution Starts Here
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Read input size
		System.out.print("Enter dataset size: ");
		int dataSize = input.nextInt();
		int[] originalArray = new int[dataSize];
		// Populate array with random values
		for (int i = 0; i < dataSize; i++) {
			originalArray[i] = (int) (Math.random() * dataSize);
		}
		// clone original array for fair sorting comparison
		int[] bubbleSortArray = Arrays.copyOf(originalArray, dataSize);
		int[] mergeSortArray = Arrays.copyOf(originalArray, dataSize);
		int[] quickSortArray = Arrays.copyOf(originalArray, dataSize);

		//measure Bubble Sort execution time
		long bubbleStartTime = System.nanoTime();
		bubbleSort(bubbleSortArray);
		long bubbleEndTime = System.nanoTime();

		//get Merge Sort execution time
		long mergeStartTime = System.nanoTime();
		divide(mergeSortArray, 0, dataSize - 1);
		long mergeEndTime = System.nanoTime();

		// calulate Quick Sort execution time
		long quickStartTime = System.nanoTime();
		quickSort(quickSortArray, 0, dataSize - 1);
		long quickEndTime = System.nanoTime();
		//display results
		System.out.println("\n--- Sorting Performance Comparison ---");
		System.out.println("Bubble Sort Time : " + (bubbleEndTime - bubbleStartTime) + " ns");
		System.out.println("Merge Sort Time  : " + (mergeEndTime - mergeStartTime) + " ns");
		System.out.println("Quick Sort Time  : " + (quickEndTime - quickStartTime) + " ns");

		// Close the scanner
		input.close();
	}
}
