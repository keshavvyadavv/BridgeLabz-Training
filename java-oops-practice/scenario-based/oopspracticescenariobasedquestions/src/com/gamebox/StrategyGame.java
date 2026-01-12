package com.gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void download() {
        System.out.println(getTitle() + " strategy game downloaded.");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing strategic planning demo...");
    }
}
