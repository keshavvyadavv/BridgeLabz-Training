package com.TourMate;

public class Transport implements IBookable {
    private String type;
    private double cost;

    public Transport(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void book() {
        System.out.println(type + " booked for rs. s" + cost);
    }

    @Override
    public void cancel() {
        System.out.println(type + " booking canceled.");
    }
}
