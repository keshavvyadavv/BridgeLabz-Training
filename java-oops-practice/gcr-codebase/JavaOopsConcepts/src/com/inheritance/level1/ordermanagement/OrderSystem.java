package com.inheritance.level1.ordermanagement;

public class OrderSystem {
    public static void main(String[] args) {
        DeliveredOrder order1 = new DeliveredOrder(
            "ORD123",
            "2025-01-10",
            "TRK789456",
            "2025-01-15"
        );

        // Display order details
        System.out.println("Order  ID: " +  order1.orderId);
        System.out.println("Order Date: " + order1.orderDate);
        System.out.println("Tracking Number: " +  order1.trackingNumber);
        
        System.out.println("Delivery  Date: " + order1.deliveryDate);
        System.out.println("Current Status: " + order1.getOrderStatus());
    }
}