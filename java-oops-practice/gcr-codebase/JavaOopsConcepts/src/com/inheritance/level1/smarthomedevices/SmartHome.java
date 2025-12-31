package com.inheritance.level1.smarthomedevices;

public class SmartHome {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat1 = new Thermostat("TH-101","ON",24);

        // Display current settings
        thermostat1.displayStatus();
    }
}