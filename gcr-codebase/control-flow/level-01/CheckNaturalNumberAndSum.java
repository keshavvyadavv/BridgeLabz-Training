// Create CheckNaturalNumberAndSum class to check the number is natural number and Sum
import java.util.Scanner;
public class CheckNaturalNumberAndSum{
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = input.nextInt();
		double sum = number*(number+1)/2.0;
		
		
		System.out.println(number >= 0 ? "The sum of " +sum+ " natural numbers is " +number : "The number " 
							+number+ " is not a natural number");
		input.close();
	}
}