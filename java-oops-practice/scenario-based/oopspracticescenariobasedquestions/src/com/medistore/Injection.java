package com.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    public Injection(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void sell(int numberOfItems) {
        int available = getQuantity();
        if (available >= numberOfItems) {
            setQuantity(available - numberOfItems);
            double totalPrice = getPrice() * numberOfItems;
            System.out.println(numberOfItems + " " + getName() + " sold. Remaining stock: " + getQuantity());
            System.out.println("Total price: " + totalPrice);
        } else {
            System.out.println("Not enough stock! Available: " + available);
        }
    }

    @Override
    public void checkExpiry(String currentDate) {
        LocalDate today = LocalDate.parse(currentDate, Medicine.formatter);
        if (today.isAfter(getExpiryDate())) {
            System.out.println(getName() + " Injection has expired! Store carefully.");
        } else {
            System.out.println(getName() + " Injection is safe for use.");
        }
    }
}
