package com.eventmanagementplatform;

public class ConferenceEvent extends Event {

    // Constructor for ConferenceEvent.
    public ConferenceEvent(int eventId, String eventName, String location, String date,
                           int attendees, double venueCost, double serviceCost, double discount) {

        super(eventId, eventName, location, date, attendees,
              venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with speakers and sessions");
        System.out.println("Total Cost: " + calculateCost());
    }
}
