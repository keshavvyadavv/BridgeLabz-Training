// Create a Factors class to find the factors of a number
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        // Check whether the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {

            // Using for loop to find factors
            System.out.print("Factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
			
        }
        input.close();
    }
}
