package com.constructors.level1;

public class PostgraduateStudent extends Student{
	PostgraduateStudent(int rollNumber , String name , double cgpa){
		super(rollNumber, name, cgpa);
	}
	public void displayName() {
        System.out.println("Student Name: " + name);
    }
	public static void main(String[] args) {
		PostgraduateStudent ps = new PostgraduateStudent(101,"Keshav",9.9);
		ps.displayName();
		ps.setCgpa(8.9);
	}
}
