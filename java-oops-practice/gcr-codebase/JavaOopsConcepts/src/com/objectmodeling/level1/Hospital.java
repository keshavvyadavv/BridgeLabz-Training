package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

class Hospital {

    private String hospitalName;
    // Hospital contains doctors and patients (simple association)
    private List<Doctor> doctors;
    private List<Patient> patients;
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public void showDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getDoctorName());
        }
    }
    public void showPatients() {
        System.out.println("Patients in " + hospitalName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}
