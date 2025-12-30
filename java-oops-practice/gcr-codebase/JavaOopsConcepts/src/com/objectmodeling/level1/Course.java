package com.objectmodeling.level1;
import java.util.ArrayList;
import java.util.List;

class Course {
    private int courseId;
    private String courseName;
    private List<Student> enrolledStudents;
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
    public String getCourseName() {
        return courseName;
    }
}
