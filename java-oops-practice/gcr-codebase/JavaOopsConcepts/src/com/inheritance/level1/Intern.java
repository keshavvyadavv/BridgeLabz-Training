package com.inheritance.level1;

public class Intern extends Employee{
	private String collegeName;
	Intern(String name , int id , int salary, String collegeName){
		super(name , id , salary);
		this.collegeName = collegeName;
	}
	protected void displayDetails(){
		super.displayDetails();
		System.out.println("The college name is: "+collegeName);
	}
}
