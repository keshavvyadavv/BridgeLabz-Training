package com.streamapi;

import java.util.*;

public class EmailNotifications {

    public static void main(String[] args) {

        List<String> emails = List.of(
            "ankit@gmail.com",
            "keshav@yahoo.com",
            "karan@outlook.com",
            "neha@gmail.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    public static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}
