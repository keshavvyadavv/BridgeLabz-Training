package com.objectmodeling.level1;

public class UniversityMain {
    public static void main(String[] args) {

        // Faculty can exist independently
        Faculty f1 = new Faculty(1, "Dr. Sharma");
        Faculty f2 = new Faculty(2, "Dr. Mehta");
        University uni = new University("Tech University");
        // Add departments (composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");
        // Add faculty (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.showDepartments();
        System.out.println();
        uni.showFaculties();
        System.out.println();
        // Deleting university
        uni.deleteUniversity();
        uni.showDepartments();
        // Faculty still exists
        System.out.println("\nFaculty still exists independently:");
        System.out.println(f1.getFacultyName());
    }
}
