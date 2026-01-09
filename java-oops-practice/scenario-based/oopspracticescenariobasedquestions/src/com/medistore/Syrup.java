package com.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    public Syrup(String name, double price, String expiryDate) {
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
            System.out.println(getName() + " Syrup has expired! Store liquids properly.");
        } else {
            System.out.println(getName() + " Syrup is safe. Keep refrigerated if needed.");
        }
    }
}
