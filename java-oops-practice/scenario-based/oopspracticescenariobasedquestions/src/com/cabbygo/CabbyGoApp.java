package com.cabbygo;
import java.util.Scanner;

public class CabbyGoApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter the vehicle number (MP041035)");
    	String vehicleNo = input.next();
        Vehicle vehicle = new Sedan(vehicleNo);
        System.out.println("enter the diver name (xyz)");
        String diverName = input.next();
        System.out.println("enter the license number (XX####YYYY####):");
        String licenseNumber = input.next();
        Driver driver = new Driver(diverName, licenseNumber , 4.8);

        IRideService ride = new RideService(vehicle, driver);
        System.out.println("Enter the number of km");
        int distance = input.nextInt();
        ride.bookRide(distance); 
        ride.endRide();
        System.out.println("Enter the rating for driver out of 5");
        double rating = input.nextDouble();
        driver.setRating(rating);
    }
}
