package com.homenest;

public class HomeNestApp {
    public static void main(String[] args) {

    	//create the objects of light, camera, ac and lock
        Device light = new Light("L101");
        Device camera = new Camera("C201");
        Device ac = new Thermostat("T301");
        Device lock = new Lock("D401");

        IControllable d1 = (IControllable) light;
        d1.turnOn();
        d1.reset();

        IControllable d2 = (IControllable) camera;
        d2.turnOn();
        d2.reset();

        System.out.println("Energy used by Camera: " + camera.getEnergyUsage());

    }
}
