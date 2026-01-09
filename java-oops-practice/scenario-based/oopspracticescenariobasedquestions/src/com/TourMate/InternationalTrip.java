package com.TourMate;

import java.util.List;

public class InternationalTrip extends Trip {
    private int baseFlightCost = 1000;

    public InternationalTrip(String destination, double budget, int durationInDays,
                             Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, budget, durationInDays, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Booking international trip to " + getDestination());
        double total = calculateTotalBudget() + baseFlightCost;
        System.out.println("Including base flight: rs. " + total);
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling international trip to " + getDestination());
    }
}
