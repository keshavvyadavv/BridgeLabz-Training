// Import the Scanner class from the java.util package
import java.util.Scanner;

// Create CentimetersToFeetAndInches Class to convert height in feet and inches
public class CentimetersToFeetAndInches{
	public static void main(String[] args){
	
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Print for user to enter the height
		System.out.println("Enter the height: ");		
		
		// Create variable height for actual fee by user
		double heightInCm = input.nextInt();
		
		// Create variable heightInInch and convert centimeters to inch
		double heightInInch = heightInCm / 2.54;
		
		// Create variable heightInFeet and convert centimeters to feet
		double heightInFeet =  heightInInch / 12.0;
		
		System.out.println("Your Height in cm is " +heightInCm+ " while in feet is " +heightInFeet+ " and inches is " +heightInInch);
		
		// Close the input to free up system resources
		input.close();
	}

}