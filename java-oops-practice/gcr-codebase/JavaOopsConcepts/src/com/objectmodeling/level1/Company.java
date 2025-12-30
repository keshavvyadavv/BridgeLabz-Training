package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String companyName;
	private List<Department> allDepartment;
	
	public Company(String companyName){
		this.companyName = companyName;
		allDepartment = new ArrayList<>();
	}
	public void addDepartment(Department department){
		allDepartment.add(department);
	}
	public void display(){
		System.out.println("List of all departments in "+companyName);
		for(Department dept : allDepartment){
			dept.getDepartmentName();
		}
	}
}
