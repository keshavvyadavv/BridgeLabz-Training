package com.artify;

public abstract class Artwork implements IPurchasable{
	private String title;
	private String artist;
	private double price;
	private String licenseType;
	protected User user;
	protected String licensingTerms;
	
	public Artwork(String title , String artist , double price , String licenseType , User user, String terms) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.user = user;
		this.licenseType = licensingTerms;
	}

	public double getPrice() {
		return price;
	}

}
