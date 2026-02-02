package com.streamapi;

import java.util.*;

public class TransformCustomerNames {

    public static void main(String[] args) {

        List<String> customerNames = List.of(
            "Ravi",
            "anita",
            "Suresh",
            "meena",
            "Karan"
        );

        customerNames.stream()
                     .map(String::toUpperCase)
                     .sorted()
                     .forEach(System.out::println);
    }
}
