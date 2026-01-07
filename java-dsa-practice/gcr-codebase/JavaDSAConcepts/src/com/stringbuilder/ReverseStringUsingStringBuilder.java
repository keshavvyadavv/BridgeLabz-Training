package com.stringbuilder;
public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        // Input string
        String input = "hello";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        String reversedString = sb.toString();

        // Output
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}