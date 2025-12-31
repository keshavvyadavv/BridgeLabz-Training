package com.inheritance.level1;
//create motorcycle class that inherite vehicle using extends
public class Motorcycle  extends Vehicle {
	private int milez;
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The milez is: "+milez+"\n");
	}
	Motorcycle(int maxSpeed , String fuelType, int milez){
		super(maxSpeed , fuelType);
		this.milez = milez;
	}
}

