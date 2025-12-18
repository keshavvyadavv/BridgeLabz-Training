// Create checkDivisibilityByFive Class to check the number is divisible by 5 or not
import java.util.Scanner;
public class  CheckDivisibilityByFive{
	public static void main(String[] args){
		
		// Create the Scanner object and take the input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = input.nextInt();
		
		if(number%5 == 0){
			System.out.println("Yes, " +number+ " is divisible by 5");
		}
		else{
			System.out.println("No, " +number+ " is not divisible by 5");
		}
		input.close();
	}
}