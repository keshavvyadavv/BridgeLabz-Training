package com.foodloop;
//FoodItem class 
public abstract class FoodItem {
    private String name;
    private String category;
    private double price;
    private int stockLevel;

    public FoodItem(String name, String category, double price, int stockLevel) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockLevel = stockLevel;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    
    //check availability without exposing stockLevel directly
    public boolean isAvailable() {
        return stockLevel > 0;
    }
}