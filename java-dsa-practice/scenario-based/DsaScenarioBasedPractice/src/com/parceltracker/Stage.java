package com.parceltracker;

//create Stage class 
public class Stage {
	public Stage next;
	public String currentStatus;
	
	//constructor
	public Stage(String currentStatus) {
		this.currentStatus = currentStatus;
		this.next = null;
	}
	
	//add Stage
	public Stage add(Stage head , Stage newStage) {
		Stage temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStage;
		return head;
	}
	
	//get current status
	public String getCurrentStatus() {
		return this.currentStatus;
	}
}
