package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;

class Customerr {

    private int customerId;
    private String customerName;
    // A customer can place multiple orders
    private List<Order> orders;
    public Customerr(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        orders = new ArrayList<>();
    }
    // Communication method
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed an order.");
    }
    public void showOrders() {
        System.out.println(customerName + "'s Orders:");
        for (Order o : orders) {
            o.showProducts();
            System.out.println("Total: ₹" + o.calculateTotal());
        }
    }
}
