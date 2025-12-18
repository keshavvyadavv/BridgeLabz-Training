// Create a FizzBuzzWithWhileLoop class to print FizzBuzz sequence 
// using while loop

import java.util.Scanner;
public class FizzBuzzWithWhileLoop {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer:  ");
        int number = input.nextInt();
		
        // Check whether the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            // Using while loop to print FizzBuzz
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
        input.close();
    }
}
