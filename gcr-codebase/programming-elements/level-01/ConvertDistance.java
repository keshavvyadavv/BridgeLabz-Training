// Import the Scanner class from the java.util package
import java.util.Scanner;

// Create ConvertDistance Class to compute distance in miles
public class ConvertDistance{
	public static void main(String[] args){
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Print for asking distance in kilometer
		System.out.println("Enter the distance in kilometer: ");
		
		// Create variable km and taking input form the user
		double km = input.nextInt();
		
		// Create variable distanceInMile for conversion distance in mile
		double distanceInMile = km/1.6;
		
		// Print distance in miles and kilometers
		System.out.println("The total miles is " +distanceInMile+ " mile for the given " +km+ " km");
		
		//Close the input to free up system resources
		input.close();
	}
}