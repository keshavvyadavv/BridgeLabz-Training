package com.bagnbal;

import java.util.*;

public class Bag {
    private int id, capacity;
    private String color;
    private List<Ball> balls = new ArrayList<>();

    //contructor
    public Bag(int id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    //getter and setter
    public void addBall(Ball ball) {
        if (balls.size() < capacity)
            balls.add(ball);
        else
            System.out.println("Bag " + id + " is full!");
    }
    public void removeBall() {
        if (!balls.isEmpty())
            balls.remove(balls.size() - 1);
    }
    public void displayBalls() {
        System.out.println("Balls in Bag " + id + ": " + balls);
    }
    public int getBallCount() {
        return balls.size();
    }
}
