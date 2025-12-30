package com.objectmodeling.level1;

public class CompanyDriver {
    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        Department it = new Department("IT");
        it.addEmployee("Rohan");
        it.addEmployee("Amit");

        Department hr = new Department("HR");
        hr.addEmployee("Neha");

        company.addDepartment(it);
        company.addDepartment(hr);

        company.display();

        // Company deleted here
        company = null;
        System.out.println("\nCompany deleted. Departments and Employees no longer exist.");
    }
}

