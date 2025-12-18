// Create Distance to convert distance in yards and miles and distance 
// provided by user in feets

import java.util.Scanner;
public class Distance{
	public static void main(String[] args){
	
		// Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Distance in feet: ");
		double distanceInFeet = input.nextDouble();
		// Conversion of Distance in yards and miles
		double yards = distanceInFeet / 3;
        double miles = distanceInFeet / 5280;
		
		// Print distance in yards and miles
		System.out.println("Distance in Yards is " + yards + " and in miles is " + miles);
		input.close();
	}
}