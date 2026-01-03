package com.cabbygo;

public class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private double fare; 
    private final double baseFare = 50;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public void bookRide(double distance) {
        fare = baseFare + distance * vehicle.getRatePerKm(); 
        System.out.println("Ride booked!");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle: " + vehicle.getType());
        System.out.println("Estimated Fare: rs. " + fare);
    }

    public void endRide() {
        System.out.println("Ride ended. Total Fare: rs. " + fare);
    }
}

