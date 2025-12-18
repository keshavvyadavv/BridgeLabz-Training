// Create a PowerOfNumber class to find the power of a number
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int number = input.nextInt();
        System.out.print("Enter a positive integer power: ");
        int power = input.nextInt();
        // Check whether the inputs are positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive integers.");
        } else {
            // Using for loop to calculate the power
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Display the result
            System.out.println(number + " raised to the power " + power + " = " + result);
        }
        input.close();
    }
}