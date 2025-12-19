//Create class MultiplicationTable class to display the table of give number
import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		
		// Create scanner object and taking the number for table print 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = input.nextInt();x
		int [] arrTable = new int[10];
		// For loop for taking number from user and store it in array
		for(int index = 0 ; index < 10 ; index++){
			arrTable[index] = number*(index+1);
		}
		
		// print the table 
		for(int index = 0 ; index < 10 ; index++){
			System.out.println(number+ " * " + (index+1)+ " = " + arrTable[index]);
		}
		input.close();
		
	}
}