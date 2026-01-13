package com.smartcheckout;
//Create SmartCehckoutApp where we use HashMap , Queue to facilitate the checkout
import java.util.*;
public class SmartCheckoutApp {

    public static void main(String[] args) {

        // Stock and Price Maps
        HashMap<String, Integer> stock = new HashMap<>();
        HashMap<String, Integer> priceList = new HashMap<>();

        // Checkout Queue
        Queue<Customer> customerQueue = new LinkedList<>();

        // Initialize Stock
        stock.put("Soap", 1000);
        stock.put("Hair Oil", 5000);
        stock.put("Detergent", 10000);
        stock.put("Maggi", 50000);
        stock.put("Water Bottle", 1000);
        stock.put("Tiffin Box", 400);
        stock.put("Biskit Packet", 599);
        stock.put("Rice(1KG)", 9000);
        stock.put("Aata(1KG)", 10000);
        stock.put("Vegetable Oil", 1000);
        stock.put("HandWash", 100);
        stock.put("Shirt", 1000);

        // Initialize Prices
        priceList.put("Soap", 100);
        priceList.put("Hair Oil", 50);
        priceList.put("Detergent", 100);
        priceList.put("Maggi", 10);
        priceList.put("Water Bottle", 99);
        priceList.put("Tiffin Box", 499);
        priceList.put("Biskit Packet", 199);
        priceList.put("Rice(1KG)", 999);
        priceList.put("Aata(1KG)", 299);
        priceList.put("Vegetable Oil", 399);
        priceList.put("HandWash", 99);
        priceList.put("Shirt", 899);

        // Customers
        //Converts array like values into a List
        customerQueue.add(new Customer("Ravi",Arrays.asList("Soap", "Hair Oil", "Detergent", "Maggi", "Water Bottle")));

        customerQueue.add(new Customer("Abhi",
                Arrays.asList("Tiffin Box", "Hair Oil", "Biskit Packet", "Rice(1KG)")));

        customerQueue.add(new Customer("Kesh",
                Arrays.asList("Aata(1KG)", "Vegetable Oil", "HandWash", "Maggi", "Shirt")));

        // Checkout Process
        System.out.println("Welcome to SmartCheckout System\n");

        while (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.poll(); // Remove customer from queue
            System.out.println("Now billing: " + customer.name);

            int totalAmount = 0;

            for (String item : customer.items) {

                if (stock.get(item) > 0) {
                    int price = priceList.get(item);
                    totalAmount += price;
                    stock.put(item, stock.get(item) - 1);

                    System.out.println("Yes " + item + " - rs " + price);
                } else {
                    System.out.println("No " + item + " - Out of Stock");
                }
            }

            System.out.println("Total Bill for " + customer.name + ": rs " + totalAmount);
            System.out.println("-------------------------------------\n");
        }

        System.out.println("All customers processed. Checkout closed.");
    }
}
