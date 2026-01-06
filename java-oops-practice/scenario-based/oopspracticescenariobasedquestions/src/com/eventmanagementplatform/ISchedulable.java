package com.eventmanagementplatform;

/*
 * ISchedulable defines scheduling-related operations.
 * Any event that can be scheduled must implement this interface.
 */
public interface ISchedulable {

    // Schedule the event
    void schedule();
    //change date and location of the event
    void reschedule(String newDate, String newLocation);
    //Cancel the event
    void cancel();
}
