package com.stringbuffer;

public class ConcatenateStringsUsingStringBuffer {

	public static void main(String[] args) {

		// Input array of strings
		String[] words = { "Java", " ", "is", " ", "powerful" };
		StringBuffer buffer = new StringBuffer();
		for (String word : words) {
			buffer.append(word);
		}
		String result = buffer.toString();

		// Output
		System.out.println("Concatenated String: " + result);
	}
}