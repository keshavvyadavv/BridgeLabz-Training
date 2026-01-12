package com.traincompanion;

//create a node class representing a train compartment
public class Compartment {
 int number;
 String service;
 Compartment prev;
 Compartment next;

 public Compartment(int number, String service) {
     this.number = number;
     this.service = service;
     this.prev = null;
     this.next = null;
 }
}
