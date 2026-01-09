package com.TourMate;

import java.util.ArrayList;
import java.util.List;

public abstract class Trip implements IBookable {
    private String destination;
    private double budget;
    private int durationInDays;

    // Services associated with the trip
    private Transport transport;
    private Hotel hotel;
    private List<Activity> activities = new ArrayList<>();

    public Trip(String destination, double budget, int durationInDays,
                Transport transport, Hotel hotel, List<Activity> activities) {
        this.destination = destination;
        this.budget = budget;
        this.durationInDays = durationInDays;
        this.transport = transport;
        this.hotel = hotel;
        this.activities = activities;
    }

    public double calculateTotalBudget() {
        double total = 0;
        if (transport != null) total += transport.getCost();
        if (hotel != null) total += hotel.getCost();
        for (Activity a : activities) total += a.getCost();
        return total;
    }

    public String getDestination() { return destination; }
    public double getBudget() { return budget; }
    public int getDurationInDays() { return durationInDays; }

    // Book and cancel will be overridden in child classes
    public abstract void book();
    public abstract void cancel();
}
