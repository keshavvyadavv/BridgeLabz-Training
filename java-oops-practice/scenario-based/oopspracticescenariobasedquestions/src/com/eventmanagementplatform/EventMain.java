package com.eventmanagementplatform;

public class EventMain {

    public static void main(String[] args) {

        Event birthday = new Birthday(101,"Aman Birthday","Indore","12-Dec-2026",50,20000,5000,2000);

        Event conference = new ConferenceEvent(201,"Tech Conference","Bhopal","20-Jan-2027",200,50000,15000,5000);

        birthday.schedule();     
        conference.schedule();   

        birthday.reschedule("15-Dec-2026", "Bhopal");
        conference.cancel();
    }
}
