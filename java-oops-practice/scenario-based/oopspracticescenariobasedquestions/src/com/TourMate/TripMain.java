package com.TourMate;

import java.util.Arrays;

public class TripMain {
    public static void main(String[] args) {
        Transport bus = new Transport("Bus", 100);
        Hotel hotel = new Hotel("Grand Hotel", 300);
        Activity sightseeing = new Activity("Sightseeing", 50);
        Activity museum = new Activity("Museum", 30);

        DomesticTrip dt = new DomesticTrip("Paris",1000,5,bus,hotel,Arrays.asList(sightseeing, museum));

        dt.book();
        dt.cancel();

        Transport flight = new Transport("Flight", 800);
        Hotel intHotel = new Hotel("International Hotel", 500);
        Activity cruise = new Activity("Cruise", 200);

        InternationalTrip it = new InternationalTrip("Tokyo",5000,7,flight,intHotel,Arrays.asList(cruise));

        it.book();
        it.cancel();
    }
}
