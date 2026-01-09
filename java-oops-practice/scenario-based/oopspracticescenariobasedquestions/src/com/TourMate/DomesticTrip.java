package com.TourMate;

import java.util.List;

public class DomesticTrip extends Trip {
    public DomesticTrip(String destination, double budget, int durationInDays,
                        Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, budget, durationInDays, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Booking domestic trip to " + getDestination());
        // book services
        System.out.println("Total cost: rs. " + calculateTotalBudget());
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling domestic trip to " + getDestination());
    }
}
