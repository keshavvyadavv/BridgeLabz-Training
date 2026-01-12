package com.homenest;

public class Camera extends Device  implements IControllable{

	public Camera(String deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus(true);
		addEnergy(0.10);
		System.out.println("Camera ON");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println("Camera OFF");
	}

	@Override
	public void reset() {
		System.out.println("Camera reset to factory settings.");
	}

}
