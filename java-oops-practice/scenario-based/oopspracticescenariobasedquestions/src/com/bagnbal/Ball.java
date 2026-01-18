package com.bagnbal;

public class Ball {
    private int id;
    private String color, size;

    //constructor
    public Ball(int id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    //print
    public String toString() {
        return "Ball{id=" + id + ", color=" + color + ", size=" + size + "}";
    }
}
