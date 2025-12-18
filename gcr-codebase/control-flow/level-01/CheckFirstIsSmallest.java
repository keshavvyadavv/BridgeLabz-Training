// Create CheckFirstIsSmallest class to check the first number is smallest or not
import java.util.Scanner;
public class CheckFirstIsSmallest{
	public static void main(String[] args){
	
		// Create Scanner object and taking input from the user in firstNumber, secondNumber, and thirdNumber
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number:");
		int secondNumber = input.nextInt();
		System.out.println("Enter the third number:");
		int thirdNumber = input.nextInt();
		
		if(firstNumber < secondNumber && firstNumber < thirdNumber){
			System.out.println("Yes, the first number " +firstNumber+ " is the smallest");
		}
		else{
			System.out.println("No, the first number " +firstNumber+ " is not smallest");
		}
		input.close();
	}
}