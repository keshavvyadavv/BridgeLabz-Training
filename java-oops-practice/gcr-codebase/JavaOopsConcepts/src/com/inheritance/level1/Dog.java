package com.inheritance.level1;

public class Dog extends Animal{
	public void makeSound() {
		System.out.println( "bow-wow");
	}
	public Dog(String name , int age) {
		super(name,age);
	}
}
