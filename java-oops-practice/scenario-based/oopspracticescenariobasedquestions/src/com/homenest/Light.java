package com.homenest;

public class Light extends Device{

	public Light(String deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {	
		setStatus(true);
		addEnergy(0.05);
		System.out.println("Light ON");
	}

	@Override
	public void turnOff() {	
		setStatus(false);
		System.out.println("Light OFF");
	}

	@Override
	public void reset() {
		System.out.println("Light reset to default brightness");
	}
	
}
