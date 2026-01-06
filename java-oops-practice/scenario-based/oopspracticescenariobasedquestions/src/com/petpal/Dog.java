package com.petpal;

public class Dog extends Pet {

    public Dog(String name, String type, int age, int hunger, int mood, int energy) {
        super(name, type, age, hunger, mood, energy);
    }

    @Override
    public void makeSound() {
        System.out.println("barking");
    }
    
}
