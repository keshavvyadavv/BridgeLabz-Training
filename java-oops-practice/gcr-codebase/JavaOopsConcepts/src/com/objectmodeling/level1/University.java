package com.objectmodeling.level1;
import java.util.ArrayList;
import java.util.List;

class University {
	
    private String universityName;
    private List<Departmentt> departments;
    private List<Faculty> faculties;      

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }
    // Adding Department
    public void addDepartment(String deptName) {
        departments.add(new Departmentt(deptName));
    }
    // Adding Faculty
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Departmentt d : departments) {
            System.out.println("- " + d.getDepartmentName());
        }
    }
    public void showFaculties() {
        System.out.println("Faculty members in " + universityName + ":");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getFacultyName());
        }
    }
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted. All departments removed.");
    }
}
