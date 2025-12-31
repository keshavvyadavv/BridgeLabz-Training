package com.inheritance.level1;

public class Cat extends Animal{
	public void makeSound() {
		System.out.println("meow");
	}
	Cat(String name , int age){
		super(name,age);
	}
}
