package com.inheritance.level1.smarthomedevices;

public class Device {
    //common attributes for all devices
    String deviceId;
    String status;
    //cnstructor for Device
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    //Method to display basic device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}



