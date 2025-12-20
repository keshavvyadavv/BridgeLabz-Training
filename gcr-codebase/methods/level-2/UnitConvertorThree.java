//Create a UnitConvertorThree class to convert in celsius,fahrenheit,kilograms,gallons
// liters.
import java.util.Scanner;
public class UnitConvertorThree {
    // convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit){
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }
    //convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius){
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds){
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
	//convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms){
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    // convert gallons to liters
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    // convert liters to gallons
    public static double convertLitersToGallons(double liters){
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args){
		
		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println("Enter  temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.println("enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        System.out.println("enter volume in liters: ");
        double liters = input.nextDouble();

		//calling the methods
        double fToC = convertFahrenheitToCelsius(fahrenheit);
        double cToF = convertCelsiusToFahrenheit(celsius);
        double poundsToKg = convertPoundsToKilograms(pounds);
        double kgToPounds = convertKilogramsToPounds(kilograms);
        double gallonsToLiters = convertGallonsToLiters(gallons);
        double litersToGallons = convertLitersToGallons(liters);

		// print the result
        System.out.println(fahrenheit + " Fahrenheit = " + fToC + " Celsius\n" +
                           celsius + " Celsius = " + cToF + " Fahrenheit\n" +
                           pounds + " lbs = " + poundsToKg + " kg\n" +
                           kilograms + " kg = " + kgToPounds + " lbs\n" +
                           gallons + " gallons = " + gallonsToLiters + " liters\n" +
                           liters + " liters = " + litersToGallons + " gallons");
		input.close();
		
    }
}
