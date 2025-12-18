// create CountDigits class to count the number of digits in an integer
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        
        // Create Scanner object to take input and take number
		//input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        // Create variable to count digits
        int count = 0;
		if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                // eliminate the last digit
                number = number / 10;
                // Increase count by 1
                count++;
            }
        }
		
		// print the count of number
		System.out.println("Count of digit is " + count);
		input.close();
	}
}