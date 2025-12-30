package com.objectmodeling.level1;

class Faculty {
    private int facultyId;
    private String facultyName;

    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}

