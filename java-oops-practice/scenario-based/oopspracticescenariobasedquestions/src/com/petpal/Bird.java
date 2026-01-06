package com.petpal;

public class Bird extends Pet {

    public Bird(String name, String type, int age, int hunger, int mood, int energy) {
        super(name, type, age, hunger, mood, energy);
    }
    @Override
    public void makeSound() {
        System.out.println("chirp chirp");
    }
}
