package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    private int orderId;
    private String customerName;
    private double orderTotal;

    public Order(int orderId, String customerName, double orderTotal) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
}

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order(101, "Amit", 2500.50),
            new Order(102, "Riya", 1800.00),
            new Order(103, "Amit", 3200.75),
            new Order(104, "Karan", 1500.00),
            new Order(105, "Riya", 2200.25)
        );

        Map<String, Double> revenueByCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      Order::getCustomerName,
                      Collectors.summingDouble(Order::getOrderTotal)
                  ));

        revenueByCustomer.forEach((customer, total) ->
            System.out.println(customer + " → Total Revenue: ₹" + total)
        );
    }
}
