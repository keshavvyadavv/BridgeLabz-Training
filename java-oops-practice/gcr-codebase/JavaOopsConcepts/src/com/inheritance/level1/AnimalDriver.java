package com.inheritance.level1;

public class AnimalDriver {
	public static void main(String[] args) {
		
		//create object but with same reference show ploymorphism 
		//and multi-level inheritance
		Animal ani = new Dog("tuk tuk" , 2);
		ani.makeSound();
		ani = new Cat("kitty",1);
		ani.makeSound();
		ani = new Bird("kooku",2);
		ani.makeSound();
	}
}
