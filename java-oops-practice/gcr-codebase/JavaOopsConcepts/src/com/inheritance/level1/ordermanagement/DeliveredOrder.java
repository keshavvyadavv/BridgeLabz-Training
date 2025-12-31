package com.inheritance.level1.ordermanagement;

public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    //Constructor 
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}