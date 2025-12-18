// Create a GreatestFactorUsingWhileLoop class to find the greatest factor of a 
//number using while loop
import java.util.Scanner;
public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
        // using while loop to find greatest factor
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // print the greatest factor
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        input.close();
    }
}
