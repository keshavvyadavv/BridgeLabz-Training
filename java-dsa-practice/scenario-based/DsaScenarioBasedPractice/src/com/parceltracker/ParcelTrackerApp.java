package com.parceltracker;
import java.util.Queue;
import java.util.LinkedList;
//Create ParcekTrackerApp that tracke the parcel
public class ParcelTrackerApp {
	public static void main(String[] args) {
		
		//create chain of tracking
		Stage head = new Stage("Packed");
		head.add(head , new Stage("Shipped"));
		head.add(head , new Stage("In Transit"));
		head.add(head , new Stage("Delivered"));
		
		//create the object of product
		Product productOne = new Product(10001, "kesh");
		
		System.out.println("Tacking Parcek for Order ID: "+productOne.orderId + "\n");
		Stage temp = head;
		
		
		while(temp != null) {
			productOne.setCurrentStatus(temp.getCurrentStatus());
			System.out.println("Parcel Status: "+productOne.getCurrentStatus());
			temp = temp.next;
		}
		
		//lost parcel check
		if(head == null) {
			System.out.println("Parcel tracking failed. Parcek might be lost.");
		}
		else {
			System.out.println("\nParcel Delivered Successfully!");
		}
	}
}
