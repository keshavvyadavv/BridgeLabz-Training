package com.homenest;

public abstract class Device implements IControllable{
	
	private String deviceId;
	private boolean status;
	private double energyUsage;
	
	public Device(String deviceId) {
		this.deviceId = deviceId;
		this.status = false;
		this.energyUsage = 0;
	}
	
	public boolean isOn() {
		return status;
	}
	
	protected void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void addEnergy(double usage) {
		energyUsage += usage;
	}
	public double getEnergyUsage() {
        return energyUsage;
    }
	
	public abstract void reset();
	
}
