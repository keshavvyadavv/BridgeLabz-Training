package com.inheritance.level1;

public class Developer extends Employee{
	private String programmingLanguage;
	
	public Developer(String name , int id , int salary, String programmingLanguage){
		super(name , id , salary);
		this.programmingLanguage = programmingLanguage;
	}
	protected void displayDetails(){
		super.displayDetails();
		System.out.println("\nThe programming language of developer is: "+programmingLanguage);
	}
}
