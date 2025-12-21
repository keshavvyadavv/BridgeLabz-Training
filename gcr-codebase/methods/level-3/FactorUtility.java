// Create FactorUtility class that performs operations on factors of a number
import java.util.Scanner;
import java.util.Arrays;
public class FactorUtility {
    // Method to find the factors of a number and return array
    public static int[] findFactors(int number) {
        // First, count how many factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Store factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // Method to find the greatest factor using factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    // method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    // Method to find the product of the cubes of the factors
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] factors = findFactors(number);

		// calling method and print result
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("product of factors : " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));
        input.close();
		
    }
}
