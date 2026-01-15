package com.examcell;
//create Student class that having all the detials of student regarding with name and score
public class Student {
    private String name;
    private int score;
    //constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    //getScore
    public int getScore() {
        return score;
    }
    //reture the score and name 
    public String toString() {
        return name + " - Score: " + score;
    }
}
