//Create a TemperatureLogger class that analyse the temperature of a week
// give the average and highest
import java.util.Scanner;
public class TemperatureLogger{
	public static void main(String [] args){
		
		//create the scanner object
		Scanner input = new Scanner(System.in);
		double[] temperatureReading = new double[7];
		double sum = 0;
		//read the temperture and store in array
		for(int i = 0 ; i < temperatureReading.length ; i++){
			System.out.println("Enter the temperature of "+(i+1)+ "th day in celius: ");
			temperatureReading[i] = input.nextDouble();
		}
		double max  = temperatureReading[0];
		//calculate max and get sum
		for(int i = 0 ; i < temperatureReading.length ; i++){
			sum += temperatureReading[i];
			if(max < temperatureReading[i]){
				max = temperatureReading[i];
			}
		}
		double average = sum/10.0;
		
		//display the result
		System.out.println("+-----------------------+");
		System.out.println("|    Day    |temperature|");
		System.out.println("+-----------------------+");
		for(int i = 0 ; i < temperatureReading.length ; i++){
			System.out.printf("|     %-5s |    %-6s |\n",i+1 , temperatureReading[i]);
		}
		System.out.println("+-----------------------+");
		System.out.println("Average temperature: "+average+ "\nHighest temperature is: "+max);
		
		
	}
}