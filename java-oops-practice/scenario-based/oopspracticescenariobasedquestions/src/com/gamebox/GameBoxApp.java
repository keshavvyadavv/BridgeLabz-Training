package com.gamebox;

public class GameBoxApp {
    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Speed Rush", 0, 4.5);
        Game g2 = new StrategyGame("War Logic", 500, 4.8);

        User user = new User("Alex");

        // seasonal offer
        g2.applyDiscount(20); 

        g1.playDemo();
        g2.playDemo();

        user.buyGame(g1);
        user.buyGame(g2);

        g1.download();
        g2.download();
    }
}

