// Create a FactorsWithWhileLoop class to find the factors of a number using
// while loop
import java.util.Scanner;
public class FactorsWithWhileLoop {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        // Check whether the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            // Using while loop to find factors
            System.out.print("Factors of " + number + " are: ");
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
					
                    System.out.print(i + " ");
					
                }
                i++;
            }
        }
        input.close();
    }
}
