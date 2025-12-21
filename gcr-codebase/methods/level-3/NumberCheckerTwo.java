//create NumberCheckerTwo class that perform operation on number. 
import java.util.Scanner;
import java.util.Arrays;
public class NumberCheckerTwo {
    //method to count the number of digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n !=  0) {
            n /= 10;
            count++;
        }
        return count;
    }
    // method to store digits in array
    public static int[] digitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int n = number;
        for (int index =  count - 1; index >=0 ; index--) {
            digits[index] = n % 10;
            n /= 10;
        }
        return digits;
    }
    //method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    //Method to find the sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
    // method to check if a number is a harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }
    // method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 0-9 digits
        for (int index = 0; index < 10; index++) {
            freq[index][0] = index; // store digit
        }
        for (int d : digits) {
            freq[d][1]++; // increase frequency
        }
        return freq;
    }
    public static void main(String[] args) {
		
		// create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = digitsArray(number);

        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("count of digits: " + countDigits(number));
        System.out.println("Sum of digits : " + sumOfDigits(digits));
        System.out.println("sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is harshad number ? " + isHarshadNumber(number, digits));

        // display frequency of digits
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
            }
        }
        input.close();
		
    }
}
