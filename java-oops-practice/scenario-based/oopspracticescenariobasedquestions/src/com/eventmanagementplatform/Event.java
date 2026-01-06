package com.eventmanagementplatform;
/*
 * Event is the base class for all event types.
 * It implements ISchedulable and provides common event details.
 */
public class Event implements ISchedulable {

    private final int eventId;
    private String eventName;
    private String location;
    private String date;
    private int attendees;
    // Pricing details (encapsulated.
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor 
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, double serviceCost, double discount) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    /*
     * Calculates total cost using operators:
     * venue cost + service cost - discount
     */
    protected double calculateCost() {
        return venueCost + serviceCost - discount;
    }

    //default scheduling behavior
    @Override
    public void schedule() {
        System.out.println("Event scheduled on " + date + " at " + location);
        System.out.println("Total Cost: " + calculateCost());
    }
    //change event date and location
    @Override
    public void reschedule(String newDate, String newLocation) {
        this.date = newDate;
        this.location = newLocation;
        System.out.println("Event rescheduled to " + date + " at " + location);
    }

    // Cancel the event
    @Override
    public void cancel() {
        System.out.println("Event has been cancelled");
    }

    //getter for eventId (no setter to maintain immutability)
    public int getEventId() {
        return eventId;
    }
}
