// Create LargestOfThree class to compute the largest of three number
import java.util.Scanner;
public class  LargestOfThree{
	public static void main(String[] args){
		
		
		// Create scanner object and taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int number1 = input.nextInt();
		System.out.println("Enter the number 2: ");
		int number2 = input.nextInt();
		System.out.println("Enter the number 3:");
		int number3 = input.nextInt();
		boolean number1Flag = false,number2Flag = false, number3Flag = false;
		if(number1 > number2 && number1 > number3){
			number1Flag = true;
		}
		else if(number2 > number1 && number2 > number3){
			number2Flag = true;
		}
		else{
			number3Flag = true;
		}
		
		// Print the largest number
		System.out.println("Is the first number the largest? " +number1Flag+ 
							"\nIs the second number the largest? " +number2Flag+
							"\nIs the third number the largest? " +number3Flag);
		input.close();
		
	}
}