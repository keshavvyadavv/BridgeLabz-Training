import java.util.Scanner;
public class UnitConvertor {
	public static double convertKmToMiles(double km){
    return km * 0.621371;
	}
	public static double convertMileToKms(double mile){
		return mile * 1.60934;
	}
	public static double convertMeterToFeets(double meter){
		return meter * 3.28084;
	}
	public static double convertFeetToMeters(double feet){
		return feet * 0.3048;
	}
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in meters: ");
		double meter = input.nextDouble();
		System.out.println("Enter the distance in kilometers: ");
		double kilometers = input.nextDouble();
		System.out.println("Enter the distance in feets: ");
		double feet = input.nextDouble();
		System.out.println("Enter the distance in miles: ");
		double miles = input.nextDouble();
		
		double kmToMiles = convertKmToMiles(kilometers);
		double mileToKm = convertMileToKms(miles);
		double meterToFeet = convertMeterToFeets(meter);
		double feetToMeter = convertFeetToMeters(feet);
		
		System.out.println(kilometers +" km = "+ kmToMiles+
							miles+ " miles \n"+meter+" meter = "+ meterToFeet+
							" feet \n" + feet + " feet = "+feetToMeter+" meter.");
	}
}