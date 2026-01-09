package com.algorithmruntimeanalysis;

import java.util.Scanner;

public class StringConcatenationPerformance {

	// inefficient string concatenation due to immutability (O(n²))
	public static void concatenateUsingString(int operationsCount) {
		String result = "";
		// it creates a new String object after concatenation 
		for (int i = 0; i < operationsCount; i++) {
			result = result + "a";
		}
	}
	//mutable StringBuilder for efficient concatenation (O(n))
	public static void concatenateUsingStringBuilder(int operationsCount) {
		StringBuilder stringBuilder = new StringBuilder();
		// appends characters without creating new objects
		for (int i = 0; i < operationsCount; i++) {
			stringBuilder.append("a");
		}
	}
	// thread-safe version of StringBuilder with similar performance (O(n))
	public static void concatenateUsingStringBuffer(int operationsCount) {
		StringBuffer stringBuffer = new StringBuffer();
		// Synchronized append operations
		for (int i = 0; i < operationsCount; i++) {
			stringBuffer.append("a");
		}
	}

	// main method
	public static void main(String[] args) {

		// create scanner object for user input
		Scanner input = new Scanner(System.in);
		System.out.print("enter number of concatenation operations: ");
		int operationsCount = input.nextInt();
		// Measure time taken by String concatenation
		long stringStartTime = System.nanoTime();
		concatenateUsingString(operationsCount);
		long stringEndTime = System.nanoTime();
		// measure time taken by StringBuilder concatenation
		long stringBuilderStartTime = System.nanoTime();
		concatenateUsingStringBuilder(operationsCount);
		long stringBuilderEndTime = System.nanoTime();
		//measure time taken by StringBuffer concatenation
		long stringBufferStartTime = System.nanoTime();
		concatenateUsingStringBuffer(operationsCount);
		long stringBufferEndTime = System.nanoTime();
		// display execution time results
		System.out.println("\n--- String Concatenation Performance ---");
		System.out.println("String Time        : " + (stringEndTime - stringStartTime) + " ns");
		System.out.println("StringBuilder Time : " + (stringBuilderEndTime - stringBuilderStartTime) + " ns");
		System.out.println("StringBuffer Time  : " + (stringBufferEndTime - stringBufferStartTime) + " ns");

		// Close scanner
		input.close();
	}
}
