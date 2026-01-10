package com.artify;
//create MainArtwork to test the program
public class MainArtwork {
	public static void main(String[] args) {
		
		//create the instance of user and artwork
		User user = new User("ravi",100000);
		Artwork digital = new DigitalArt("magic photo", "keshav", 500,"digital license" , user);
		//purchase method calling
		digital.purchase();
		//get the current user balance after purchase
		double currentBalance = user.getBalance();
		System.out.println(currentBalance);
		
	}
}
