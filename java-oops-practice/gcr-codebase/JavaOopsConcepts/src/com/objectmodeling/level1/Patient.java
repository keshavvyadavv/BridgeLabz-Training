package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

class Patient {

    private int patientId;
    private String patientName;
    // A patient can consult multiple doctors (association)
    private List<Doctor> doctors;
    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
        doctors = new ArrayList<>();
    }
    // Called when a patient consults a doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public String getPatientName() {
        return patientName;
    }
    // Show all doctors consulted by the patient
    public void showDoctors() {
        System.out.println(patientName + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getDoctorName());
        }
    }
}
