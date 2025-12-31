package com.inheritance.level1;

public class Bird extends Animal{
	public void makeSound() {
		System.out.println("Chirp-chirp");
	}
	Bird(String name , int age){
		super(name,age);
	}
}
