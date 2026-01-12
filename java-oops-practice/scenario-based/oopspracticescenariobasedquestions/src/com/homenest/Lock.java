package com.homenest;

public class Lock extends Device implements IControllable{

	private boolean locked = true;
	
	public Lock(String deviceId) {
		super(deviceId);
	}

	public void turnOn() {
		locked = false;
		setStatus(true);
		System.err.println("Door Unlocked");
	}

	public void turnOff() {
		locked = true;
		setStatus(false);
		System.out.println("Door Locked");
	}

	public void reset() {
		locked = true;
		System.out.println("Lock reset to locked state");
	}
}
