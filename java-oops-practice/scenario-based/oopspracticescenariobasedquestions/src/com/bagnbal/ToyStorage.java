package com.bagnbal;

public class ToyStorage {
    public static void main(String[] args) {
    	
        Bag bag1 = new Bag(1, "Red", 2);
        bag1.addBall(new Ball(101, "Blue", "small"));
        bag1.addBall(new Ball(102, "green", "Medium"));
        bag1.addBall(new Ball(103, "Yellow", "large")); 
        bag1.displayBalls();
        System.out.println("ball  count: " + bag1.getBallCount());

        bag1.removeBall();
        bag1.displayBalls();
    }
}
