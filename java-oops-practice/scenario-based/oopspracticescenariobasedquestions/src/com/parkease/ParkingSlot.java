package com.parkease;

import java.util.ArrayList;
import java.util.List;

//create class ParkingSlot 
public class ParkingSlot {
	private int slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;
	//internal booking records (private)
	private List<String> bookingLogs;

	//constructor for slot initialization
	public ParkingSlot(int slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
		this.bookingLogs = new ArrayList<>();
	}

	//slot internally
	public boolean assignSlot(Vehicle vehicle) {
		if (!isOccupied &&
			vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) {

			isOccupied = true;
			bookingLogs.add("Slot " + slotId +
			                " booked for " + vehicle.vehicleNumber);
			return true;
		}
		return false;
	}

	//slot internally
	public void releaseSlot() {
		isOccupied = false;
		bookingLogs.add("Slot " + slotId + " released.");
	}
	//availability check
	public boolean isAvailable() {
		return !isOccupied;
	}

	//booking logs safely
	public void showLogs() {
		System.out.println("\n--- Booking Logs ---");
		for (String log : bookingLogs) {
			System.out.println(log);
		}
	}
}