// Import the Scanner class from the java.util package
import java.util.Scanner;

// Create UniversityFee Class to compute offer by university on fee to student where fee given by user
public class UniversityFee{
	public static void main(String[] args){
	
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Print for user to enter the fee
		System.out.println("Enter the fee: ");
		// Create variable fee for actual fee by user
		double fee = input.nextInt();
		
		// Print for user to enter the discount percent
		System.out.println("Enter the discount percent: ");
		// Create variable discountPercent for discount percent given by user
		double discountPercent = input.nextInt();
		
		// Create discountAmount for calculating the discount amount
		double discountAmount = (double)(125000/10);
			
		// Create finalFee for calculating the final amount
		double finalFee = (double)fee - discountAmount;
			
		// Print the discount amount and final fee
		System.out.println("The discount amount is INR " +discountAmount+ " and final discounted fee is INR " +finalFee);
		
		// Close the input to free up system resources
		input.close();
	}

}