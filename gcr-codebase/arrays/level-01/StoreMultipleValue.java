// Create StoreMultipleValue class for storing multiple value in array 
// based on user input
import java.util.Scanner;
public class StoreMultipleValue{
	public static void main(String[] args){
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		double [] numbers  = new double[10];
		double sum = 0; 
		int index = 0; 
		// While loop for checking the number given by user and store in numbers.
		while(true){
			System.out.println("Enter the number and if you want to exit enter negative number or zero: ");
			double value = input.nextDouble();
			if(value <= 0 || index == 10){
				break;
			}
			numbers[index] = value;
			index++;
		}
		// For loop for calculating total sum
		for(index = 0 ; index < 10 ; index++){
			sum = sum + numbers[index];
		}
		
		// print the total 
		System.out.println("The total value is: "+sum);
		input.close();
	}	
}