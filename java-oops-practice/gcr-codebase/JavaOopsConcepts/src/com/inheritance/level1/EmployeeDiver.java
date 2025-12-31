package com.inheritance.level1;

public class EmployeeDiver {
	public static void main(String[] args) {
		
		Employee emp = new Manager("john",2,1300000,3);
		emp.displayDetails();
		emp = new Developer("liger",21,5000000,"Java");
		emp.displayDetails();
		emp = new Intern("rohan",94,1500,"xyz");
		emp.displayDetails();
	}
}
