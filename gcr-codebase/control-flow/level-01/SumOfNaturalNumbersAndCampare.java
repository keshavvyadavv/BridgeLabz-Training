// Create a SumOfNaturalNumbers class to find the sum using for loop
// and formula
import java.util.Scanner;

public class SumOfNaturalNumbersAndCampare {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            // Compute sum using loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            // Compute sum using formula n*(n+1)/2
            int sumFormula = n * (n + 1) / 2;
            // Display results
            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula  = " + sumFormula);
            // Compare both results.
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations are not equal.");
            }
        }

        input.close();
    }
}
