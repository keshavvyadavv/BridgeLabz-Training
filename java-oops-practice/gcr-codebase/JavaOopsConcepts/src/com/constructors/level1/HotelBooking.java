package com.constructors.level1;

//Create HotelBooking class manages hotels and using constructor chaining , using parameterized 
//non-parameterized constructor

public class HotelBooking {
 private String guestName;
 private int roomType;
 private int nights; 
 // Default constructor
 HotelBooking() {
     this.guestName = "Default Guest";
     this.roomType = 1; 
     this.nights = 1;
 }
 // Parameterized constructor.
 HotelBooking(String guestName, int roomType, int nights) {
     this.guestName = guestName;
     this.roomType = roomType;
     this.nights = nights;
 }
 // Copy constructor
 HotelBooking(HotelBooking other) {
     this.guestName = other.guestName;
     this.roomType = other.roomType;
     this.nights = other.nights;
 }
 // Getter methods
 public String getGuestName() {
     return this.guestName;
 }
 public int getRoomType() {
     return this.roomType;
 }
 public int getNights() {
     return this.nights;
 }
 // Display method
 public void displayBooking() {
     System.out.println("Guest Name: " + guestName +
                        ", Room Type: " + roomType +
                        ", Nights: " + nights);
 }
 public static void main(String[] args) {
     
     // Using default constructor
     HotelBooking defaultBooking = new HotelBooking();
     defaultBooking.displayBooking();
     // Using parameterized constructor
     HotelBooking customBooking = new HotelBooking("Alice", 2, 3);
     customBooking.displayBooking();
     // Using copy constructor
     HotelBooking copyBooking = new HotelBooking(customBooking);
     copyBooking.displayBooking();
		
 }
}
