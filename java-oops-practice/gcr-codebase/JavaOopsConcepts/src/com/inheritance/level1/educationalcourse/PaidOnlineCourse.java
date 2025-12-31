package com.inheritance.level1.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    //constructor 
    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    //method to calculate final fee 
    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }
}