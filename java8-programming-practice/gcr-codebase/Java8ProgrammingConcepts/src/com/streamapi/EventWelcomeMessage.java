package com.streamapi;

import java.util.*;

public class EventWelcomeMessage {

    public static void main(String[] args) {

        List<String> attendees = List.of(
            "Amit",
            "Riya",
            "Karan",
            "Neha",
            "Rahul"
        );

        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
