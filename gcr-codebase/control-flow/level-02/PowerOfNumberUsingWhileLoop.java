// Create a PowerOfNumber class to find the power of a number 
//using while loop
import java.util.Scanner;
public class PowerOfNumberUsingWhileLoop {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        //Check whether the power is a non-negative integer
        long result = 1;
        int counter = 0;
        // using while loop to calculate the power
        while (counter < power) {
            result *= number;
            counter++;
        }

        // print the result
        System.out.println(number + " raised to the power " + power + " = " + result);
        input.close();
    }
}
