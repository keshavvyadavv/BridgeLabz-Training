// Create CheckPositiveNegativeOrZero class to compute the number is positive, negative or zero
import java.util.Scanner;
public class CheckPositiveNegativeOrZero{
	public static void main(String[] args){
		
		// Create object scanner and taking input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = input.nextInt();
		
		
		System.out.println(number == 0 ? "zero" :
						   number > 0 ? "positive"
						   : "negative");
		input.close();
	}
}