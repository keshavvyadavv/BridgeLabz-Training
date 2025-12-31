package com.inheritance.level1.smarthomedevices;

public class Thermostat extends Device {
    int temperatureSetting;

    // Constructor for Thermostat
    Thermostat(String deviceId, String status, int temperatureSetting) {
       
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    // displayStatus method
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}