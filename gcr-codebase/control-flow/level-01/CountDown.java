// Create CountDown class and print the count down
import java.util.Scanner;
public class CountDown{
	public static void main(String[] args){
		
		// Create scanner object and taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the countdown: ");
		int countDown = input.nextInt();
		
		// Print countDown
		while(countDown >= 1){
			System.out.println(countDown);
			countDown--;
		}
		input.close();
	}

}