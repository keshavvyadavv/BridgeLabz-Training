package com.inheritance.level1.ordermanagement;

public class ShippedOrder extends Order {
    String trackingNumber;
 
    ShippedOrder(String orderId, String  orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber =  trackingNumber;
    }

    String getOrderStatus() {
        return   "Order Shipped";
    }
}

