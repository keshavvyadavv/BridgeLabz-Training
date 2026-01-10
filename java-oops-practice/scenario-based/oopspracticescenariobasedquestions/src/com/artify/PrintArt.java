package com.artify;
//create printArt class 
public class PrintArt extends Artwork {

	//constructor
	public PrintArt(String title, String artist, double price, String licenseType, User user) {
		super(title, artist, price, licenseType, user,"Standard PrintArt License");
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

	@Override
	public void license() {
		System.out.println("Applying Digital License: "+licensingTerms);
	}

}
