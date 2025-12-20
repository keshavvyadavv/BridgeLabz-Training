// Create  UnitConvertor class that convert in yards,feet,meter,inches
import java.util.Scanner;
public class UnitConvertorTwo {
	// convert yards to feet
	public static double convertYardsToFeet(double yards){
		double yards2feet = 3;
		return yards * yards2feet;
	}
	//Convert feet to yards
	public static double convertFeetToYards(double feet){
		double feet2yards = 0.333333;
		return feet * feet2yards;
	}
	//Convert meters to inches
	public static double convertMetersToInches(double meters){
		double meters2inches = 39.3701;
		return meters * meters2inches;
	}
	//Convert inches to meters
	public static double convertInchesToMeters(double inches){
		double inches2meters = 0.0254;
		return inches * inches2meters;
	}
	// Convert inches to centimeters
	public static double convertInchesToCentimeters(double inches){
		double inches2cm = 2.54;
		return inches * inches2cm;
	}
	public static void main(String [] args){
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in yards: ");
		double yards = input.nextDouble();
		System.out.println("Enter the distance in feet: ");
		double feet = input.nextDouble();
		System.out.println("Enter the distance in meters: ");
		double meters = input.nextDouble();
		System.out.println("Enter the distance in inches: ");
		double inches = input.nextDouble();
		// calling methods
		double yardsToFeet = convertYardsToFeet(yards);
		double feetToYards = convertFeetToYards(feet);
		double metersToInches = convertMetersToInches(meters);
		double inchesToMeters = convertInchesToMeters(inches);
		double inchesToCm = convertInchesToCentimeters(inches);
		
		// print the result
		System.out.println(
			yards + " yards = " + yardsToFeet + " feet\n" +
			feet + " feet = " + feetToYards + " yards\n" +
			meters + " meters = " + metersToInches + " inches\n" +
			inches + " inches = " + inchesToMeters + " meters\n" +
			inches + " inches = " + inchesToCm + " centimeters"
		);
		input.close();

	}
}
