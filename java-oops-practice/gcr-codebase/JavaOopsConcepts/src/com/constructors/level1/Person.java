package com.constructors.level1;

//Create a Person class with a copy constructor that clones another person's attributes.
public class Person {
 private int age;
 private String gender;
 Person(int age , String gender){
     this.age = age;
     this.gender = gender;
 }
	//create the constructor for clone
 Person(Person other){
     this.age = other.age;
     this.gender = other.gender;
 }
	//getter for age
 private int getAge(){
     return this.age;
 }
	//getter for string
 private String getGender(){
     return this.gender;
 }
 public static void main(String[] args) {
		
		//create object of person
     Person p1 = new Person(13, "Keshav");
     Person p2 = new Person(p1);
     System.out.println(p2.getAge() + " " + p2.getGender());
 }
}