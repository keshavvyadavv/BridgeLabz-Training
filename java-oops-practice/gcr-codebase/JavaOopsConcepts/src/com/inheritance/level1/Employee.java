package com.inheritance.level1;

public class Employee {
	private String name;
	private int id;
	private int salary;
	
	protected void displayDetails(){
		System.out.println("The name of Empolyee is: "+name+"\nThe id of Employee is: "+id
							+"\nThe salary of Employee is: "+salary);
	}
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
}
