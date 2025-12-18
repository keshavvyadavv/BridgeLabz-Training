// Create a FactorialAndNatureNumber class to find the factorial of a 
// number using for loop
import java.util.Scanner;
public class FactorialAndNatureNumber {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        // Check whether the number is a natural number
        if (n < 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            // Compute factorial using for loop
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
			
            // Display the factorial
            System.out.println("factorial of " + n + " = " + factorial);
        }
        input.close();
    }
}
