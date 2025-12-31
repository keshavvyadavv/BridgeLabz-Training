package com.inheritance.level1;

public class Manager extends Employee{
	private int teamSize;
	Manager(String name , int id , int salary, int teamSize){
		super(name , id , salary);
		this.teamSize = teamSize;
	}
	protected void displayDetails(){
		super.displayDetails();
		System.out.println("\nThe teamsize is: "+teamSize);
	}
}
