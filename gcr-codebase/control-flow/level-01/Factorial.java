// Create a Factorial class to find the factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        // Compute factorial using while loop
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }

        // print factorial
        System.out.println("Factorial of " + n + " = " + factorial);
        input.close();
    }
}
