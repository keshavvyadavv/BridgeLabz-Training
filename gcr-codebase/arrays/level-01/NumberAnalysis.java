// Create NumberAnalysis class to analyze numbers: positive/
//negative/zero, even /odd,  and compare first & last  elements
import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {

        // Create Scanner object for user input and define array size
        Scanner input = new Scanner(System.in);
        int arraySize = 5;
        // declare integer array to store numbers
        int[] numbers = new int[arraySize];
        for (int  index = 0; index < numbers.length ; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = input.nextInt();
        }
		
        System.out.println("\nNumber Analysis Results:");
        // Loop for number analyze 
        for (int index = 0 ; index < numbers.length; index++) {
            int currentNumber = numbers[index];
            // Check if the number is positive
            if (currentNumber > 0) {
                // Check if the positive number is even or odd
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is a positive even  number.");
                } else {
                    System.out.println(currentNumber + " is a positive  odd number.");
                }
            }
            // Check if the number is negative
            else if (currentNumber < 0) {
                System.out.println(currentNumber + " is a negative number.");
            }
            // The number is zero
            else {
                System.out.println(currentNumber + " is zero.");
            }
        }
        // Compare the first and last elements of the array
        int firstElement =  numbers[0];
        int lastElement = numbers[numbers.length - 1] ;
        System.out.println("\ncomparison of first and last elements :");

        if (firstElement == lastElement) {
            System.out.println("First element and last element are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element .");
        }
        input.close();
    }
}
