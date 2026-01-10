package com.foodloop;

public class FoodMain {
    public static void main(String[] args) {
        // 1. Create some Food Items
        FoodItem pizza = new NonVegItem("Pepperoni Pizza", 15.00, 10);
        FoodItem burger = new NonVegItem("Beef Burger", 8.50, 5);
        FoodItem salad = new VegItem("Garden Salad", 7.00, 3);
        FoodItem soda = new VegItem("Cola", 2.50, 20);
        FoodItem cake = new VegItem("Chocolate Cake", 6.00, 0);

        System.out.println("Standard Order");
        Order myOrder = new Order();
        myOrder.addItem(pizza);
        myOrder.addItem(cake);
        myOrder.placeOrder(); 

        System.out.println("\nCustom Combo Meal");
        // Using the overloaded constructor: (Main, Side, Drink)
        Order comboOrder = new Order(burger, salad, soda);
        comboOrder.placeOrder();

        System.out.println("\nLarge Order (High Discount)");
        Order bigOrder = new Order();
        for(int i = 0; i < 5; i++) {
            bigOrder.addItem(pizza); 
        }
        bigOrder.placeOrder(); 
    }
}