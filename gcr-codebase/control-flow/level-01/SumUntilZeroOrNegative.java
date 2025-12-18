// Create a SumUntilZeroOrNegative class to find the sum of numbers
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        // using infinite while loop with break statement
        while (true) {
            System.out.print("Enter a number (enter 0 or negative number to stop): ");
            double num = input.nextDouble();
            // Check for stop condition
            if (num <= 0) {
                break;
            }
            total += num;
        }

        // Display the total sum
        System.out.println("Total sum = " + total);
        input.close();
    }
}
