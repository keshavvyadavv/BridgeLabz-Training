package com.eventmanagementplatform;

/*
 * User represents the organizer of events. */
public class User {

    private int userId;
    private String name;
    private String email;
    private String phone;

    // Constructor to initialize user details.
    public User(int userId, String name, String email, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
