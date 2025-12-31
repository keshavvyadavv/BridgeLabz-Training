package com.inheritance.level1;
//create Truck class that inherite vehicle using extends
public class Truck extends Vehicle {
	private int loadingCapacity;
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The loading capacity(Load) is: "+loadingCapacity+"\n");
	}
	Truck(int maxSpeed , String fuelType, int loadingCapacity){
		super(maxSpeed , fuelType);
		this.loadingCapacity = loadingCapacity;
	}
}

