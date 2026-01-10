package com.artify;

//create DigitalArt class 
public class DigitalArt extends Artwork{

	//constructor
	public DigitalArt(String title, String artist, double price, String licenseType, User user) {
		super(title, artist, price, licenseType, user,"Standard Digital License");
	}

	//purchase method that done balance operation
	@Override
	public void purchase() {
		if(user.getBalance() >= getPrice()) {
			user.setBalance(user.getBalance() - getPrice());
			System.out.println("Purchased Digital Art: "+ getPrice());
		}else {
			System.out.println("you not have sufficant balance.");
		}	
	}

	//method for license
	@Override
	public void license() {
		System.out.println("Applying Digital License: "+licensingTerms);
	}
	
}
