package com.streamapi;
import java.time.LocalDate;
import java.util.*;

class GymMember {
    private int id;
    private String name;
    private LocalDate expiryDate;

    public GymMember(int id, String name, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}

public class ExpiringMemberships {

    public static void main(String[] args) {

        List<GymMember> members = List.of(
            new GymMember(1, "Amit", LocalDate.now().plusDays(10)),
            new GymMember(2, "Riya", LocalDate.now().plusDays(40)),
            new GymMember(3, "Karan", LocalDate.now().plusDays(25)),
            new GymMember(4, "Neha", LocalDate.now().plusDays(5)),
            new GymMember(5, "Rahul", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
               .filter(m -> !m.getExpiryDate().isBefore(today)
                         && !m.getExpiryDate().isAfter(next30Days))
               .forEach(m -> System.out.println(
                   m.getName() + " | Expiry: " + m.getExpiryDate()
               ));
    }
}
