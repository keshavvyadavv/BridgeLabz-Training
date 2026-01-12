package com.homenest;

public class Thermostat extends Device  implements IControllable{

	private int temperature;
	public Thermostat(String deviceId) {
		super(deviceId);
		temperature = 24;
	}

	@Override
	public void turnOn() {
		setStatus(true);
		addEnergy(0.20);
		System.out.println("AC ON");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println("AC OFF");
	}

	@Override
	public void reset() {
		temperature = 24;
		System.out.println("Thermostat reset to 24C");
	}

}
