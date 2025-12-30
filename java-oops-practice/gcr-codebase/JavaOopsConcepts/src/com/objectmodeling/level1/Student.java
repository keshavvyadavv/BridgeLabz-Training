package com.objectmodeling.level1;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentId;
    private String name;
    private List<Course> courses;
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // bidirectional association
    }
    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
    public String getName() {
        return name;
    }
}
