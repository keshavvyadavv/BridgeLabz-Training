package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

class SchoolMain {

    public static void main(String[] args) {

        School school = new School("Green Valley School");
        Student s1 = new Student(1, "Rohan");
        Student s2 = new Student(2, "Anita");
        Course c1 = new Course(101, "Java Programming");
        Course c2 = new Course(102, "Data Structures");
        school.addStudent(s1);
        school.addStudent(s2);
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);
        school.showStudents();
        System.out.println();
        s1.showCourses();
        System.out.println();
        c1.showStudents();
    }
}

