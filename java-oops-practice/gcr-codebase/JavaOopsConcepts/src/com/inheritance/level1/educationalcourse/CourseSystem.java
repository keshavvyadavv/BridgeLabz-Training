package com.inheritance.level1.educationalcourse;

public class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse course1 = new PaidOnlineCourse("Java Programming",40,"Udemy",true,5000,20);

        // Display course details
        System.out.println("Course name: " + course1.courseName);
        System.out.println("duration: " + course1.duration + " hours");
        System.out.println("Platform: " +  course1.platform);
        
        System.out.println(" Recorded: " + course1.isRecorded);
        System.out.println("Oriiginal Fee: " + course1.fee);
        System.out.println("Discount: " + course1.discount + "%");
        System.out.println("final Fee: " + course1.calculateFinalFee());
    }
}