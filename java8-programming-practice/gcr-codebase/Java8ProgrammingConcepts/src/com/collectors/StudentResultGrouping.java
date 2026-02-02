package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = List.of(
            new Student(1, "Amit", "A"),
            new Student(2, "Riya", "B"),
            new Student(3, "Karan", "A"),
            new Student(4, "Neha", "C"),
            new Student(5, "Rahul", "B"),
            new Student(6, "Sneha", "A")
        );

        Map<String, List<String>> studentsByGrade =
            students.stream()
                    .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                    ));

        studentsByGrade.forEach((grade, names) ->
            System.out.println(grade + " → " + names)
        );
    }
}
