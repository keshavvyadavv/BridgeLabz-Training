package com.inheritance.level1.educationalcourse;

public class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    //constructor for OnlineCourse
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
