package com.searching.linear;

public class SearchWordInSentences {
	public static void main(String[] args) {

		// Input array of sentences
		String[] sentences = { "kotlin is a powerful language", "Learning basic concept is important",
				"Linear search is simple", "Practice makes perfect" };
		String word = "search";
		// Call search method
		String result = findSentenceContainingWord(sentences, word);
		// Output
		System.out.println("Search Result: " + result);
	}

	// Linear search method
	public static String findSentenceContainingWord(String[] sentences, String word) {
		for (String sentence : sentences) {
			if (sentence.contains(word)) {
				return sentence; 
			}
		}
		return "Not Found";
	}
}