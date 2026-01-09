package com.parkease;

// Truck vehicle type
public class Truck extends Vehicle {
	public Truck(String vehicleNumber) {
		super(vehicleNumber, 90); // ₹90 per hour
	}
	@Override
	public double calculateCharges(int hours) {
		
		double penalty = (hours > 4) ? 200 : 0;
		return (baseRate * hours) + penalty;
	}
}