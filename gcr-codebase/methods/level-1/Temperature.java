// Create Temperature class for to check windSpeed
import java.util.Scanner;
public class Temperature {
    //method to calculate wind chill
    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74+ (0.6215 * temperature)+ (0.4275 * temperature - 35.75) 
							* Math.pow(windSpeed, 0.16);
        return windChill;
    }
    public static void main(String[] args) {
		
		//Create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.print("Enter  Wind Speed in mph : ");
        double windSpeed = input.nextDouble();
		// create temperature object
        Temperature tempObj = new Temperature();
        double result = tempObj.calculateWindChill(temperature, windSpeed);
		
		// print the result
        System.out.println("Wind Chill Temperature: " + result);
        input.close();
    }
}
