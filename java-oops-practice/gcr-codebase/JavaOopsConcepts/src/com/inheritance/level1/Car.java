package com.inheritance.level1;

public class Car extends Vehicle {
	private int seatCapacity;
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The seat capacity is: "+seatCapacity+"\n");
	}
	Car(int maxSpeed , String fuelType, int seatCapacity){
		super(maxSpeed , fuelType);
		this.seatCapacity = seatCapacity;
	}
}
