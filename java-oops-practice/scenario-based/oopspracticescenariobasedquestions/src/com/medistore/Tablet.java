package com.medistore;
import java.time.LocalDate;

public class Tablet extends Medicine{

	public Tablet(String name, double price, String expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}
	public Tablet(String name, double price, String expiryDate) {
		super(name, price, expiryDate, 0);
	}

	@Override
	public void sell(int numberOfItems) {
		int available = getQuantity();
		if(available >= numberOfItems) {
			setQuantity(available - numberOfItems);
			double totalPrice = getPrice() * numberOfItems;
			System.out.println(numberOfItems + " " + getName() + " sold. Remaining stock: " + getQuantity());
            System.out.println("Total price: " + totalPrice);
		}
		else {
			System.out.println("Not enough stock! Available: " + available);
		}
	}

	@Override
	public void checkExpiry(String currentDate) {
			LocalDate today = LocalDate.parse(currentDate, Medicine.formatter);
	       	if(today.isAfter(getExpiryDate())) {
				System.out.println(getName() + " Tablet has expired!");
			}
			else {
				System.out.println(getName() + " Tablet is safe to use.");
			}
	}


}