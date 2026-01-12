package com.trafficmanager;

//create TrafficManagerApp that test
public class TrafficManagerApp {
    public static void main(String[] args) {

        TrafficManager manager = new TrafficManager();
        manager.enqueueVehicle("Car-101");
        manager.enqueueVehicle("bick-102");
        manager.enqueueVehicle("truck-103");

        manager.enterRoundabout();
        manager.enterRoundabout();
        
        manager.printRoundabout();
        manager.printWaitingQueue();

        manager.exitRoundabout();
        manager.printRoundabout();
    }
}