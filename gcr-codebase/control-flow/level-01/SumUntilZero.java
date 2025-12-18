// Create a SumUntilZero class to find the sum of
// numbers entered by the user
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter a number (enter 0 to stop): ");
        double num = input.nextDouble();
        // Using while loop to add numbers until user enters 0
        while (num != 0) {
            total += num;
            System.out.print("Enter a number (enter 0 to stop): ");
            num = input.nextDouble();
        }

        // display the total sum
        System.out.println("Total sum = " + total);
        input.close();
    }
}
