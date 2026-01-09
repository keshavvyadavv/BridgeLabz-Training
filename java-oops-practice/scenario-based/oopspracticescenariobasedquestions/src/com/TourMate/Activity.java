package com.TourMate;

public class Activity implements IBookable {
    private String name;
    private double cost;

    public Activity(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void book() {
        System.out.println("Activity " + name + " booked for $" + cost);
    }

    @Override
    public void cancel() {
        System.out.println("Activity " + name + " canceled.");
    }
}
