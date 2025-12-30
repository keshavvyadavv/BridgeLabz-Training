package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

class Doctor {

    private int doctorId;
    private String doctorName;
    // A doctor can consult multiple patients (association)
    private List<Patient> patients;
    public Doctor(int doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        patients = new ArrayList<>();
    }
    public String getDoctorName() {
        return doctorName;
    }
    // Communication method
    public void consult(Patient patient) {
        // Add patient to doctor's list
        patients.add(patient);
        // Add doctor to patient's list
        patient.addDoctor(this);
        // Communication output
        System.out.println("Dr. " + doctorName + " is consulting patient " + patient.getPatientName());
    }
    // Show all patients consulted by the doctor
    public void showPatients() {
        System.out.println("Dr. " + doctorName + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}

