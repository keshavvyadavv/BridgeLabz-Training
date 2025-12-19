// create MultiplicationFromSixToNine class to print table from 6 to 9
// of number given by user and display the result
import java.util.Scanner;
public class MultiplicationFromSixToNine{
	public static void main(String[] args){
	
		// Create scanner object and taking the input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of what you want to print table");
		int number = input.nextInt();
		int [] multiplicationResult = new int[4];
		// For loop for computing the table
		for(int index = 6 ; index <= 9 ;index++){
			multiplicationResult[index-6] = index*number;
		}
		
		// print the table
		for(int index = 6 ; index <= 9 ; index++){
			System.out.println(number+ " * " +index+ " = " + multiplicationResult[index-6]);
		}
		input.close();
	}
}