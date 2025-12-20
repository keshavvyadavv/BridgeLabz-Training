// create a SumOfNaturalNumber class to find the sum of natural number
import java.util.Scanner;
public class SumOfNaturalNumber{
	public int findSum(int number){
		int sum = 0;
		for(int num = 1 ; num <= number ; num++){
			sum = sum + num;
		}
		return sum;
	}
	public static void main(String [] args){
		
		// Create the Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		// Create the SumOfNaturalNumber object to access findSum method
		SumOfNaturalNumber sNaturalNumber = new SumOfNaturalNumber();
		int result = sNaturalNumber.findSum(number);
		
		// print the result
		System.out.println("The sum of natural number is: "+ result);
		input.close();
	}
}