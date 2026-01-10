package com.skillforge;

public class SkillForgeMain  {
    public static void main(String[] args) {
        // 1. Create Users using Inheritance
        Instructor prof = new Instructor("Dr. James Gosling");
        Student student1 = new Student("Aria");
        Student student2 = new Student("Ethan");

        // 2. Create Courses using Overloaded Constructors
        // Course A: Uses default modules (Beginner)
        Course javaBasics = new Course("Java 101",prof.getName(),"Initial internal review: Good for starters.");

        // Course B: Uses custom modules (Advanced)
        String[] advModules = {"Memory Management", "Concurrency", "JVM Internals"};
        Course javaAdv = new Course("Advanced Java", prof.getName(),advModules, "Advanced", "Initial internal review: Very challenging.");

        System.out.println("--- SkillForge Learning Portal ---");

        student1.updateProgress(100.0); 
        student2.updateProgress(45.5);  

        // Certification
        System.out.println("\nChecking Certification for " + student1.getName() + ":");
        if (student1.getProgress() >= 100.0) {
            javaBasics.getCertificate();
        }

        System.out.println("\nChecking Certification for " + student1.getName() + " (Advanced):");
        javaAdv.getCertificate(); 

       
        System.out.println("\n--- Administrative Data ---");
        System.out.println("Admin Note on " + javaBasics.getInternalReview());
        
    }
}