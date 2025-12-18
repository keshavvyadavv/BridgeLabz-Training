// Create ArmstrongNumber class that check if a number is armstrong or not.

import java.util.Scanner;
public class ArmstrongNumber{
	public static void main (String[] args){
		
		// Create a Scanner Object and take number as input
		int number;
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = input.nextInt();
		// Store the original number for comparison later
        int copyOfNumber = number;
        int sumOfCubes = 0;
		// Loop until all digits of the number are processed
		while(number != 0){
			int remainder = number % 10 ;
			int cubeOfNumber = remainder * remainder * remainder;
			sumOfCubes = sumOfCubes + cubeOfNumber;
			number = number / 10;
		}
		
		// Check whether the original number is equal to the sum of cubes
		System.out.println(copyOfNumber + " " + ( copyOfNumber == sumOfCubes ? "is a armstrong number" 
		                    : "is not a armstrong number"));
		input.close();
		
	}
};