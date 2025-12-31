package com.inheritance.level1.ordermanagement;

public class Order {
    String orderId;
    String orderDate;
    // Constructor 
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
}