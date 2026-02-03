package com.stream;
import java.util.stream.*;
import java.util.*;

public class BasicQuestions {
	public static void main(String[] args) {
		//1.Character Frequency Count
		//Input: "banana"
		//Output: {b=1, a=3, n=2}
		
		String input = "banana";
		
		Map<Character, Long> freq =  input.chars()
										.mapToObj(c->(char)c)
										.collect(Collectors.groupingBy(
												c -> c,
												Collectors.counting()
										));
//		System.out.println(freq);
		
		//2.Word Frequency Count
		//Input: "java is java and java is fast"
		//Output: {java=3, is=2, and=1, fast=1}
		
		String str = "java is java and java is fast";
		Map<String , Long> freqCount = Arrays.stream(str.split("\\s+"))
											 .collect(Collectors.groupingBy(
													 word -> word,
													 Collectors.counting()));
		
//		System.out.println(freqCount);
		

//			3.First Non-Repeating Character
//			
//			Input: "stress"
//			Output: t
		
		String string = "stress";
		char result = string.chars()
							.mapToObj(c -> (char)c)
							.collect(Collectors.groupingBy(
									c -> c,
									LinkedHashMap::new,
									Collectors.counting()
									))
							.entrySet()
							.stream()
							.filter(e->e.getValue() == 1)
							.map(Map.Entry::getKey)
							.findFirst()
							.orElse(null);
		
//		System.out.println(result);
		
		//4.All Non-Repeating Characters
		//
		//Input: "programming"
		//Output: p o r a i n (only chars with count = 1)
		
		String hey = "programming";
		hey.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(
				c-> c , 
				LinkedHashMap::new, 
				Collectors.counting()  
				))
		.entrySet()
		.stream()
		.filter(e -> e.getValue() == 1)
		.map(Map.Entry::getKey);
//		.forEach(c -> System.out.print(c + " "));
		
		//5.Remove Duplicate Characters
	//		Input: "banana"
	//		Output: "ban"
		
		String sample = "banana";
		String res = sample.chars()
					  .mapToObj(c -> (char)c)
					  .distinct()
					  .map(String::valueOf)
					  .collect(Collectors.joining());
//		System.out.println(res);
		
		//6.Remove Repeating Characters (Keep Only Unique Once)
		//Input: "aabbccdde"
		//Output: "e"
		
		String s = "aaabbccdde";
		
		String r = s.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new , Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e -> e.getValue() == 1)
		.map(Map.Entry::getKey)
		.map(String::valueOf)
		.collect(Collectors.joining(","));
		
		//7.Remove Non-Alphanumeric Characters
		//Input: "ja@va#8!!"
		//Output: "java8"
		
		String samplee = "ja@va#8!!";
		String answer = samplee.chars()
				.mapToObj(c -> (char)c)
				.filter(Character::isLetterOrDigit)
				.map(String::valueOf)
				.collect(Collectors.joining());
//		System.out.println(answer);
		
		//8.Keep Only Alphabets
		//Input: "java8stream2025"
		//Output: "javastream"
		
		String bString = "java8stream2025";
		String ress = bString.chars()
							 .mapToObj(c -> (char)c)
//							 .filter(Character::isLetter)
							 .filter(c -> Character.isLetter(c))
//							 .map(String::valueOf)
							 .map(c -> String.valueOf(c))
							 .collect(Collectors.joining());
		System.out.println(ress);
		
		
		//9.Keep Only Digits
		//Input: "orderId=AB123XZ9"
		//Output: "1239"
		
		String app = "orderId=AB123XZ9";
		
		String plus = app.chars().mapToObj(c -> (char)c)
			.filter(c -> Character.isDigit(c))
			.map(c -> c.toString())
			.collect(Collectors.joining());
		
//		System.out.println();
		
//		10.Count Each Character Except Spaces
		//Input: "java stream"
		//Output: frequency map without space
		
		String pluss = "java stream";
		
		Map<Character , Long> freqq = pluss.chars()
			 .mapToObj(c -> (char)c)
			 .filter(c -> c != ' ')
		     .collect(Collectors.groupingBy(
		    		 c->c,
		    		 LinkedHashMap::new,
		    		 Collectors.counting()));
		
		System.out.println(freqq);
		
//		  1. Count vowels in a string using Stream
//			 Input: "programming"
//			 Output: 3
		String inputt = "kkkkkkkkkkkkk";
				
		int count = (int)inputt.chars()
		                  .filter(e->e == 'a'||e=='i'|| e == 'o'||e == 'u' || e =='e')
		                  .count();
		                  //.orElse(0);
	    System.out.println(count);
			
		
//		 2. Count number of words in a sentence
//	    	Input: "Java is very powerful"
//	    	Output: 4
		
	    String sam = "Java is very powerful";
	    int words = (int)Arrays.stream(sam.trim().split("\\s+")).count();
	    System.out.println(words);
		
	      //3. Find even numbers from list
	 // 	   Input: [2,5,7,8,10,13]
	 // 	   Output: [2,8,10]
		int [] arr = {2,5,7,8,10,13};
        int[]  resultrrr = Arrays.stream(arr).filter(e -> e%2 == 0).toArray();
        //System.out.println(Arrays.toString(resultrrr));;
        
        //4. Convert list of strings to uppercase
//           Input: ["java","spring","boot"]
//        	 Output: ["JAVA","SPRING","BOOT"]
        
        String [] arrayy = {"java","spring","boot"};
        arrayy = Arrays.stream(arrayy).map(e -> e.toUpperCase()).toArray(String[]::new);
        
        System.out.println(Arrays.toString(arrayy));
        
        //5. Find string length list
//        Input: ["cat","elephant","dog"]
//        		Output: [3,8,3]
		
        String [] question = {"cat","elephant","dog"};	
        int [] ans = Arrays.stream(question).mapToInt(String::length).toArray();
        
//        System.out.println(Arrays.toString(ans));
        
//        
//        6. Count strings starting with ‘a’
//        Input: ["apple","banana","ant","car"]
//        Output: 2
		
        String [] ques = {"apple","banana","ant","car"};
		int an = (int) Arrays.stream(ques).filter(e -> e.startsWith("a")).count();
		
		System.out.println(an);
		
		//7. Remove empty strings
//		Input: ["java","","spring","","boot"]
//				Output: ["java","spring","boot"]
		
		String[] strr = {"java","","spring"," k","boot"};
		String [] rr = Arrays.stream(strr).filter(ss -> ss.trim().length() != 0).toArray(String[]::new);
//		System.out.println(Arrays.toString(rr));
		
		//8. Sum of all numbers using stream
//			 Input: [1,2,3,4,5]
//			 Output: 15
		
		int [] q = {1,2,3,4,5};
		int total = Arrays.stream(q).sum();
		
		System.out.println(total);
		
		//9. Find max number
//		Input: [10,25,3,99,45]
//				Output: 99
		
		int [] w = {10,25};
		int max = Arrays.stream(w).max().getAsInt();
		System.out.println(max);
		
//		10. Reverse each string in list
//		Input: ["java","api"]
//		Output: ["avaj","ipa"]
		
		String [] g = {"java", "api"};
		String [] as = Arrays.stream(g).map(e -> new StringBuilder(e).reverse().toString()).toArray(String[]::new);
		
		System.out.println(Arrays.toString(g));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
