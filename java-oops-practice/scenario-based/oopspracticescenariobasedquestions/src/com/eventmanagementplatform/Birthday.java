package com.eventmanagementplatform;

public class Birthday extends Event {

    /*
     * Constructor for BirthdayEvent.
     * Calls parent constructor using super().
     */
    public Birthday(int eventId, String eventName, String location, String date,
                         int attendees, double venueCost, double serviceCost, double discount) {

        super(eventId, eventName, location, date, attendees,
              venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled with cake and decorations");
        System.out.println("Total Cost: " + calculateCost());
    }
}
