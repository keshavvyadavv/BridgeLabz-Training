// Create a GreatestFactor class to find the greatest factor of a number 
// besides itself
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        // using for loop to find greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // print the greatest factor
        System.out.println("The greatest factor of " + number + 
							" is: " + greatestFactor);
        input.close();
    }
}
