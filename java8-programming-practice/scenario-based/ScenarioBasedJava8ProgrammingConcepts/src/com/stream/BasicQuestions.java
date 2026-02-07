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
					  .map(c -> String.valueOf(c))// converts a char to a String. Now the stream becomes Stream<String>
					  .collect(Collectors.joining());
//		System.out.println(res);
		//We use map(String::valueOf) to convert Character stream into String stream
		//because joining() works only with Strings.
		
		//6.Remove Repeating Characters (Keep Only Unique Once)
		//Input: "aabbccdde"
		//Output: "e"
		
		String s = "aaabbcdde";
		
		String r = s.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new , Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e -> e.getValue() == 1)
		.map(Map.Entry::getKey)
		.map(String::valueOf)
		.collect(Collectors.joining(","));
		System.out.println("new answer : "+r);
		
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
//		System.out.println(ress);
		
		
		//9.Keep Only Digits
		//Input: "orderId=AB123XZ9"
		//Output: "1239"
		
		String app = "orderId=AB123XZ9";
		
		String plus = app.chars().mapToObj(c -> (char)c)
			.filter(Character::isDigit)
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
		
//		System.out.println("answer"+freqq);
		
//		  1. Count vowels in a string using Stream
//			 Input: "programming"
//			 Output: 3
		String inputt = "kkkkkkkkkkkkk";
				
		int count = (int)inputt.chars()
		                  .filter(e->e == 'a'||e=='i'|| e == 'o'||e == 'u' || e =='e')
		                  .count();
		                  //.orElse(0);
//	    System.out.println(count);
			
		
//		 2. Count number of words in a sentence
//	    	Input: "Java is very powerful"
//	    	Output: 4
		
	    String sam = "Java is very powerful";
	    int words = (int)Arrays.stream(sam.trim().split("\\s+")).count();
//	    System.out.println(words);
		
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
        
//        System.out.println(Arrays.toString(arrayy));
        
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
		
//		System.out.println(an);
		
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
		
//		System.out.println(total);
		
		//9. Find max number
//		Input: [10,25,3,99,45]
//				Output: 99
		
		int [] w = {10,25};
		int max = Arrays.stream(w).max().getAsInt();
//		System.out.println(max);
		
//		10. Reverse each string in list
//		Input: ["java","api"]
//		Output: ["avaj","ipa"]
		
		String [] g = {"java", "api"};
		String [] as = Arrays.stream(g).map(e -> new StringBuilder(e).reverse().toString()).toArray(String[]::new);
//		System.out.println(Arrays.toString(g));
		
		
		//11. Remove duplicate elements from list
//			  Input: [1,2,2,3,4,4,5]
//			  Output: [1,2,3,4,5]
		
		int[] nums = {1,2,2,3,4,4,5};
		int [] ff = Arrays.stream(nums).distinct().toArray();
//		System.out.println(Arrays.toString(ff));
//		Arrays.stream convert it in intStream then the distinct remove duplicates then toArray() converts IntStream back to int[]
		
//		12. Sort list in descending order
//		Input: [5,1,9,3]
//		Output: [9,5,3,1]
		
		int [] numss = {5,1,9,3};
		int [] rees = Arrays.stream(numss)		//Converts int[] to IntStream
							.boxed()			//convert intStream to IntegerStream because the comparator is only works for objects
							.sorted(Comparator.reverseOrder())
							.mapToInt(Integer::valueOf)//convert IntegerStream to intStream
							.toArray();//convert in intstream to int[] and IntStream.toArray() returns int[]. and Stream<Integer>.toArray() returns Object[]
//		System.out.println(Arrays.toString(rees));
		
		
//		13. Find second highest number
//		Input: [10,40,30,20]
//		Output: 30
		
		
		int [] ss = {10,40,30,20};
		int sss = (int)Arrays.stream(ss)//Arrays.stream(ss) → IntStream
				.boxed()				//boxed() → Stream<Integer>
				.sorted(Comparator.reverseOrder()) //sorted(Comparator.reverseOrder()) → descending order
				.skip(1)				//skip(1) → skips highest element
				.findFirst()			//findFirst() → second highest as Optional<Integer>
				.orElse(-1);            //orElse(-1) → default if not present

//		System.out.println(sss);
		
//		14. Join strings with comma
//		Input: ["Java","Spring","Boot"]
//		Output: "Java,Spring,Boot"
		
		String[] st = {"Java","Spring","Boot"};
		String rt = Arrays.stream(st).collect(Collectors.joining(","));
		
//		System.out.println(rt);
		//Arrays.stream(st) → converts array to Stream<String>
		//collect() → collects stream elements
		//Collectors.joining(",") → joins elements with comma
		
//		15. Frequency of each character
//		Input: "banana"
//		Output: {b=1, a=3, n=2}
		
		String stt = "banana";
		Map<Character , Long> ffreqq = stt.chars()
											.mapToObj(c -> (char)c)
											.collect(Collectors.groupingBy(c->c,LinkedHashMap::new ,Collectors.counting()));
		
		//System.out.println(ffreqq);
		
//		16. Find numbers greater than 50
//		Input: [10,55,60,23,90]
//		Output: [55,60,90]
		
		int[] qtt = {10,55,60,23,90};
		int [] ar = Arrays.stream(qtt).filter(e -> e>50).toArray();
//		System.out.println(Arrays.toString(ar));
		
		
//		17. Group strings by length
//		Input: ["a","bb","ccc","dd"]
//		Output: {1=[a], 2=[bb,dd], 3=[ccc]}
		
		String [] sl = {"a","bb","ccc","dd"};
		
		Map<Integer,List<String>> a = Arrays.stream(sl).collect(Collectors.groupingBy(String::length));
//		System.out.println(a);
		
//		18. Find first non-repeated character
//		Input: "stress"
//		Output: t
		
		String p = "stress";
		char qq = p.chars().mapToObj(c -> (char)c)
					.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
					.entrySet()
					.stream()
					.filter(e -> e.getValue() == 1)
					.map(Map.Entry::getKey)
					.findFirst()
					.orElse('1');
				
//		System.out.println(qq == '1' ? "not found" : qq);
				
//		19. Convert List<Integer> to List<String>
//		Input: [1,2,3]
//		Output: ["1","2","3"]
				
		
		List<Integer> qs = Arrays.asList(1,2,3);
		List<String> l = qs.stream().map(String::valueOf).toList();
//		System.out.println(l);
		
		
//		20. Count occurrences of each word
//		Input: "java is java and java is fast"
//		Output: {java=3, is=2, and=1, fast=1}
		
		
		String sr = "java is java and java is fast";
		Map<String , Long> fr = Arrays.stream(sr.split("\s+"))               // important
									.collect(Collectors.groupingBy(word -> word, LinkedHashMap::new,Collectors.counting()));
//		System.out.println(fr);
		
		
//		21. Partition numbers into even and odd
//		Input: [1,2,3,4,5,6]
//		Output: {even=[2,4,6], odd=[1,3,5]}
		
		int [] aar = {1,2,3,4,5,6};
		Map<String , List<Integer>> f = Arrays.stream(aar)//Converts int[] to IntStream
												.boxed()  //IntStream → Stream<Integer>
												.collect(Collectors.groupingBy(n -> n%2==0 ? "even" : "odd"));//Converts boolean condition into String keys
		//System.out.println(f);
		
//		22. Find duplicate elements only
//		Input: [1,2,3,2,4,5,1]
//		Output: [1,2]
		
		int [] d = {1,2,3,2,4,5,1};
		int [] rrr = Arrays.stream(d)
						.boxed() //// IntStream → Stream<Integer> because grouping only works for non-Primitive
						.collect(Collectors.groupingBy(c->c , Collectors.counting()))
						.entrySet()
						.stream()
						.filter(e -> e.getValue() > 1)
						.mapToInt(Map.Entry::getKey)//Converts to primitive int
						.toArray();//return int[]
//		System.out.println(Arrays.toString(rrr));
		
//		23. Find longest string
//		Input: ["java","microservices","api"]
//		Output: "microservices"
				
		String [] m = {"java","microservices","api"};
		String t = Arrays.stream(m)
						.max(Comparator.comparingInt(String::length))
						.orElse(null);
//		System.out.println(t);
				
//		24. Find top 3 highest numbers
//		Input: [10,90,30,70,50]
//		Output: [90,70,50]
		
		
		int [] b = {90,30,30,30,30};
		int [] k = Arrays.stream(b) 
						.distinct()	//Converts primitive int → Integer Required for sorting with Comparator
						.boxed()	// IntStream → Stream<Integer>
						.sorted(Comparator.reverseOrder())// descending
						.limit(3)					// take top 3
						.mapToInt(Integer::intValue) // back to int
						.toArray();// convert int to []int
		
//		System.out.println(Arrays.toString(k));
		
//		25. Flatten list of lists
//		Input: [[1,2],[3,4],[5]]
//		Output: [1,2,3,4,5]
		
		List<List<Integer>> ll = Arrays.asList(
				                        Arrays.asList(1,2),
				                        Arrays.asList(3,4),
				                        Arrays.asList(5)
				                 );
		
		List<Integer> rs = ll.stream()
								.flatMap(List::stream) //flatMap() is used to flatten a stream of collections into a single stream.
								.toList();
//		System.out.println(rs);
		
//		26. Find sum of squares of even numbers
//		Input: [1,2,3,4,5]
//		Output: 20 (2² + 4²)
		
		int [] ad = {1,2,3,4,5};
		
		int rq = Arrays.stream(ad)
						.filter(e->e%2 == 0)
						.map(e->e*e)
						.sum();
//		System.out.println(rq);
		
//		27. Sort map by value
//		Input: {A=3, B=1, C=2}
//		Output: {B=1, C=2, A=3}
		
		String kk = "java is power lang";
//		int counnt = Arrays.stream(kk.split("\\s+")).
		
		
		
		
		
		
		
		
		
		
	}
}
