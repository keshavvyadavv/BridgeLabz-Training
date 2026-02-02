package com.streamapi;


import java.util.*;

class Doctor {
    private int id;
    private String name;
    private String specialty;
    private boolean availableOnWeekend;

    public Doctor(int id, String name, String specialty, boolean availableOnWeekend) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }
}

public class HospitalDoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor(1, "Dr. Sharma", "Cardiology", true),
            new Doctor(2, "Dr. Mehta", "Neurology", false),
            new Doctor(3, "Dr. Rao", "Orthopedics", true),
            new Doctor(4, "Dr. Khan", "Dermatology", true),
            new Doctor(5, "Dr. Patel", "Neurology", true),
            new Doctor(6, "Dr. Singh", "Cardiology", false)
        );

        doctors.stream()
               .filter(d -> d.isAvailableOnWeekend())
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(d -> System.out.println(
                   d.getName() + " | " + d.getSpecialty()
               ));
    }
}
