package com.constructors.level1;
//Create a Student class with:
//rollNumber (public).
//name (protected).
//CGPA (private).
//Write methods to:
//Access and modify CGPA using public methods.
//Create a subclass PostgraduateStudent to demonstrate the use of protected members.
public class Student {
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	public void setCgpa(double newCgpa) {
		this.cgpa = newCgpa;
	}
	public double getCgpa() {
        return cgpa;
    }
	Student(int rollNumber , String name , double cgpa){
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
}
