// Create CalculatorBasic class for basic calculator for 
// addition, subtraction, multiplication, and division

import java.util.Scanner;
public class CalculatorBasic{
	public static void main(String[] args){
		
		// Create Scanner Object to take user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int number1 = input.nextInt();
		System.out.println("Enter number 2:");
		int number2 = input.nextInt();
		// Caculate the addition, subtraction, multiplication and division 
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// Print the value solution
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
		                    + number1 + " and " + number2 + " is " + addition + " , " + subtraction + 
							" , " + multiplication + " and " + division);
		input.close();

	}
}