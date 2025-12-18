// Create VoteEligibility to check the user is eligible or not
import java.util.Scanner;
public class VoteEligibility{
	public static void main(String[] args){
		
		
		// Create scanner object and taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int age = input.nextInt();
		
		
		System.out.println(age >= 18 ? "The person's age is " +age+ " and can vote."
							: "The person's age is " +age+ " and cannot vote.");
		input.close();
	}
}