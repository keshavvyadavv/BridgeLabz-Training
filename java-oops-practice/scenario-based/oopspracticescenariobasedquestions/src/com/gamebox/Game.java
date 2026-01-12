package com.gamebox;

public abstract class Game implements IDownloadable {

    private String title;
    private String genre;
    protected double price;
    private double rating;

    // Constructor for free or paid game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    //seasonal offer using operator
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }
}
