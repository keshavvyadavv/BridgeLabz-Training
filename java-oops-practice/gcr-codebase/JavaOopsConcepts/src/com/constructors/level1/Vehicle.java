package com.constructors.level1;
//Problem 3: Vehicle Registration
//Create a Vehicle class to manage the details of vehicles:
//Instance Variables: ownerName, vehicleType.
//Class Variable: registrationFee (fixed for all vehicles).
//Methods:
//An instance method displayVehicleDetails() to display owner and vehicle details.
//A class method updateRegistrationFee() to change the registration fee.

public class Vehicle{
	private String ownerName;
	private String vehicleType;
	
	public static double registrationFee = 9999;
	Vehicle(String ownerName , String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	public void displayVehicleDetails() {
		System.out.println("The name of owner is: "+ownerName +". The vehicle type is: "+vehicleType);
	}
	public static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
	}
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("keshav", "four wheeler");
		v1.displayVehicleDetails();
		updateRegistrationFee(12999);
	}
}