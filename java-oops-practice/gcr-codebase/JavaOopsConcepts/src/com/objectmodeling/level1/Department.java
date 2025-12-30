package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String departmentName;
	private List<Employee> allEmployee;
	
	Department(String departmentName){
		this.departmentName = departmentName;
		allEmployee = new ArrayList<>();
	}
	public void getDepartmentName(){
		System.out.println("Name of the department is: "+departmentName);
	}
	public void displayEmployee(){
		System.out.println("List of all employee: ");
		for(Employee epm: allEmployee) {
			epm.display();
		}
	}
	public void addEmployee(String empName) {
		allEmployee.add(new Employee(empName));
	}
}
