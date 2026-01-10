package com.foodloop;
import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Standard constructor
    public Order() {
        this.total = 0.0;
    }

    // Constructor for Custom Combo Meals 
    public Order(FoodItem main, FoodItem side, FoodItem drink) {
        addItem(main);
        addItem(side);
        addItem(drink);
        System.out.println("Combo Meal Created!");
    }

    public void addItem(FoodItem item) {
        if(item.isAvailable()) {
            items.add(item);
            total += item.getPrice();
        }
    }

    private double calculateDiscount() {
        if (total > 50.0) {
            return total * 0.20; // 20% off for large orders
        } else if (total > 20.0) {
            return total * 0.9; //9% off for medium orders
        }
        return 0.0;
    }

    @Override
    public void placeOrder() {
        double discount = calculateDiscount();
        double finalPrice = total - discount;
        
        System.out.println("Order placed for " + items.size() + " items.");
        System.out.println("Total: rs. " + total);
        System.out.println("Discount: -rs. " + discount);
        System.out.println("Final Bill: rs. " + finalPrice);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}