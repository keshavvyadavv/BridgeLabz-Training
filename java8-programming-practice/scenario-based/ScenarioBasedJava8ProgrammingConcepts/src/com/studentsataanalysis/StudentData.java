package com.studentsataanalysis;

import java.util.Arrays;
import java.util.stream.*;
import java.util.*;


public class StudentData {

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Suresh", "Su", 24, "Male", "Mumbai", "Mechanical", 45, Arrays.asList("9876543210")),
                new Student(2, "Anita", "Ani", 26, "Female", "Pune", "Computer", 12, Arrays.asList("9123456780", "9988776655")),
                new Student(3, "Rahul", "Ra", 22, "Male", "Bangalore", "Electronics", 78, Arrays.asList("9876123450")),
                new Student(4, "Sneha", "Sn", 27, "Female", "Mumbai", "Mechanical", 33, Arrays.asList("9999888877", "8888777766")),
                new Student(5, "Kiran", "Ki", 29, "Male", "Chennai", "Computer", 5, Arrays.asList("9876501234")),
                new Student(6, "Priya", "Pr", 21, "Female", "Hyderabad", "Biotech", 56, Arrays.asList("9123009876")),
                new Student(7, "Siddharth", "Si", 23, "Male", "Mumbai", "Mechanical", 67, Arrays.asList("9876543211", "9876543212")),
                new Student(8, "Rohit", "Ro", 28, "Male", "Pune", "Electronics", 89, Arrays.asList("9876512345")),
                new Student(9, "Simran", "Sm", 25, "Female", "Bangalore", "Computer", 44, Arrays.asList("9988776655")),
                new Student(10, "Amit", "Am", 30, "Male", "Mumbai", "Mechanical", 15, Arrays.asList("9123456789"))
        );
    }
    
    public static void main(String[] args) {
		
    	List<Student> studentData = getStudents();
    	
    	//Basic Filtering & Mapping
    	//1.Print all students whose rank is less than 50.
//    	studentData.stream()
//    			.filter(s-> s.getRank() < 50)
//    			.forEach(System.out::println);
//    	
    	List<Student> StudentHavingLessRank = studentData.stream()
    												     .filter(e -> e.getRank() < 50)
    												     .collect(Collectors.toList());
    	
    	//2.Print all students whose age is greater than 25.
//    	studentData.stream()
//    				.filter(s->s.getAge() > 25)
//    				.forEach(System.out::println);
    	
    	List<Student> StudentHavingLessAge = studentData.stream()
    													.filter(s -> s.getAge() > 25)
    													.collect(Collectors.toList());
    	
    	//3.Print the names of all students only.
    	
//    	studentData.stream()
//    			   .map(Student::getName)
//    			   .forEach(System.out::println);
    	
  
    	//4.Print all students belonging to Mechanical Engineering.
    	
//    	studentData.stream().filter(s->s.getDepartment().equals("Mechanical"))
//    						.forEach(System.out::println);
    	
    	//5.Print all students not from Mumbai.
    	
//    	studentData.stream()
//    			   .filter(s -> !s.getCity().equals("Mumbai"))
//    			   .forEach(System.out::println);
    	
    	
    	//Sorting & Limiting
    	//1.Sort students by rank (ascending).
    	
    	List<Student> sortedByRank = studentData.stream()
    											.sorted(Comparator.comparingInt(Student::getRank))
    											.collect(Collectors.toList());
    	
//    	sortedByRank.forEach(System.out::println);
    	
    	//2.Sort students by age (descending).
    	List<Student> sortedByAge = studentData.stream()
    										   .sorted(Comparator.comparingInt(Student::getAge).reversed())
    										   .collect(Collectors.toList());
//    	studentData.stream()
//    						.sorted(Comparator.comparingInt(Student::getAge).reversed()).forEach(System.out::println);
//    	
    	
    	//3.Print top 5 students based on rank.
    	
//    	studentData.stream()
//    			   .sorted(Comparator.comparingInt(Student::getRank))
//    			   .limit(5)
//    			   .forEach(System.out::println);
    	List<Student> topFive = studentData.stream()
    									   .sorted(Comparator.comparing(Student::getRank))
    									   .limit(5)
    									   .collect(Collectors.toList());
    	
    	
    	//4.Print last 3 students based on rank.
    	
//    	studentData.stream()
//    			   .sorted(Comparator.comparing(Student::getRank))
//    			   .limit(3)
//    			   .map(Student::getName)
//    			   .forEach(System.out::println);
    	
    	//5.Print students sorted by name and then rank.
    	
    	
//    	studentData.stream().sorted(Comparator.comparing(Student::getName)
//    													.thenComparingInt(Student::getRank))
//														.forEach(System.out::println);
    	
    	//*** Grouping & Aggregation
    	
    	//1.Count the number of students in each department.
    	
    	Map<String,Long> countByDepartment = studentData.stream()	
    													.collect(Collectors.groupingBy(
    															Student::getDepartment,
    															Collectors.counting()
    															));
//    	countByDepartment.forEach((dept, count)->System.out.println(dept + " " + count));
    	
    	
    	//2.Count the number of students in each city.
    	
    	Map<String, Long> studentAndCity = studentData.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting()));
    	
//    	studentAndCity.forEach((city,totalStudent)->System.out.println(city + " " + totalStudent));
    	
    	//3.Find the average age of students in each department.
    	
    	Map<String , Double> studentAndAverageAge = studentData.stream()
    														   .collect(Collectors.groupingBy(
    																Student::getDepartment,
    																Collectors.averagingInt(Student::getAge)));
    	
//    	studentAndAverageAge.forEach((dept,avg)->System.out.println(dept + " " + avg));
    	
//    	4.Find the average rank of students by gender.
    	
    	Map<String , Long> genderAndAverageRank = studentData.stream()
    													     .collect(Collectors.groupingBy(
    													    		 Student::getGender,
    													    		 Collectors.counting()));
    	
    	//genderAndAverageRank.forEach((gender,averageRank)->System.out.println(gender + " " + averageRank));
    	
    	
    	
    	//5.Find the total number of students in the organization.
    	
    	Long totalNumberOfStudent = studentData.stream().count();
    	
//    	System.out.println("Total number of students: "+totalNumberOfStudent);
    	
    	//6.Find the department with the highest average rank.
    	
    	String topDept = studentData.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getRank))).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    	
    	System.out.println(topDept);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
