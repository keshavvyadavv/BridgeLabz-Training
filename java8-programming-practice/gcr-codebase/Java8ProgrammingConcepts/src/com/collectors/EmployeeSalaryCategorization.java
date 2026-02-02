package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee(1, "Amit", "IT", 50000),
            new Employee(2, "Riya", "HR", 45000),
            new Employee(3, "Karan", "IT", 60000),
            new Employee(4, "Neha", "Finance", 70000),
            new Employee(5, "Rahul", "HR", 55000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));

        avgSalaryByDept.forEach((dept, avgSalary) ->
            System.out.println(dept + " → Average Salary: ₹" + avgSalary)
        );
    }
}

