package com.skillforge;
//create Course class having all the details of course
public class Course {
	
	private String title;
	private String instructor;
	private String [] modules;
	private double rating;
	private String difficultyLevel;
	final String internalReview;
	

	//constructor
	public Course(String title , String instructor , String review) {
		this.title = title;
		this.instructor = instructor;
		this.rating = 10;
		this.difficultyLevel = "hard";
		this.modules = new String []{"Introduction", "body", "conclusion"};
		this.internalReview = review;
	}

	
	public Course(String title , String instructor , String [] modules, String difficultyLevel ,String review) {
		this.title = title;
		this.instructor = instructor;
		this.rating = 10;
		this.difficultyLevel = difficultyLevel;
		this.modules = modules;
		this.internalReview = review;
	}
	
	public void updateRating(double newRating) {
		this.rating = (newRating+this.rating)/2;
	}
	
	public String getInternalReview() {
		return internalReview;
	}
	
	public void getCertificate() {
		System.out.println("--- OFFICIAL CERTIFICATE ---");
        System.out.println("Course: " + title);
        if (difficultyLevel.equalsIgnoreCase("hard")) {
            System.out.println("Level: GOLD (Professional Certification)");
        } else {
            System.out.println("Level: SILVER (Completion Certificate)");
        }
	}
}
