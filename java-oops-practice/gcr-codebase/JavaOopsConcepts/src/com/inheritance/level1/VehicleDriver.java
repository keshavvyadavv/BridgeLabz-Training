package com.objectmodeling.level1;

public class VehicleDriver {
	
	public static void main(String[] args) {
		
		//create object and display the method that belongs to that class
		Vehicle v1 = new Car(190,"Petrol",6);
		v1.displayInfo();
		v1 = new Truck(210 , "Diesel", 4000);
		v1.displayInfo();
		v1 = new Motorcycle(90, "Petrol", 60);
		v1.displayInfo();
	}
}
