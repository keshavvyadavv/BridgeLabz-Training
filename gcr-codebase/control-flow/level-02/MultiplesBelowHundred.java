// Create a MultiplesBelowHundred class to find all multiples of a 
//number below 100
import java.util.Scanner;
public class MultiplesBelowHundred {
    public static void main(String[] args) {
	
        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        // Check whether the number is a positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a valid positive integer less than 100.");
        } 
		else {

            // Using for loop backward to find multiples below 100
            System.out.print("Multiples of " + number + " below 100 are: ");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
			
        }
        input.close();
    }
}
