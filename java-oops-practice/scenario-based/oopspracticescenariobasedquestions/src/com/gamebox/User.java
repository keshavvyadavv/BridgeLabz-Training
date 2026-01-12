package com.gamebox;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access
    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to library.");
    }

    // Read-only access
    public List<Game> getOwnedGames() {
        return new ArrayList<>(ownedGames);
    }
}
