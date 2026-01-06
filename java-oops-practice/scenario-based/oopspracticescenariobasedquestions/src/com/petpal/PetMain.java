package com.petpal;

public class PetMain {
    public static void main(String[] args) {

        Pet pet = new Dog("Tuktuk", "Dog", 2, 50, 60, 70);
        pet.makeSound();  
        pet.play();
        pet.feed();

        System.out.println("Mood: " + pet.getMood());
        System.out.println("Energy: " + pet.getEnergy());
    }
}
