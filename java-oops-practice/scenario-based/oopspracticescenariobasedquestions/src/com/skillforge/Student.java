package com.skillforge;
//create Student class that extends user 
public class Student extends User{

	private double progress = 0.0;
	
	//constructor and using super keyword send to parent class
	public Student(String name) {
		super(name);
	}
	
	//getter for progress
	public double getProgress() {
		return progress;
	}
	public void updateProgress(double p) { 
		this.progress = p; 
	}
}
