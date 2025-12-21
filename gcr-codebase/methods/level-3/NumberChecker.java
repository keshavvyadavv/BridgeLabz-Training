//create NumberChecker class that perform operation on number.
import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker {
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
    // method to store digits in  array
    public static int[] digitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int n = number;
        for (int i =  count - 1; i >=0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }
    //  Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1;  i < digits.length ; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
	//method to check if a number is Armstrong
    public static boolean isArmstrongNumber(int[] digits) {
        int sum = 0;
        int n = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        int original = 0;
        for (int d : digits) {
            original = original * 10 + d;
        }
        return sum == original;
    }// Method to find largest and second largest digits
    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
		if(secondLargest == Integer.MIN_VALUE){
			secondLargest = -1;
		}
        return new int[]{largest, secondLargest};
    }
    //Method to find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
		if(secondSmallest == Integer.MAX_VALUE){
			secondSmallest = -1;
		}
        return new int[]{smallest, secondSmallest};
    }
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = digitsArray(number);
		
        System.out.println("Digits array: " + Arrays.toString(digits));
        // Count of digits
        System.out.println("count of digits: " + countDigits(number));
        // Duck number check
        System.out.println("Is duck number? " + isDuckNumber(digits));
        // Armstrong number check
        System.out.println("is Armstrong number ? " + isArmstrongNumber(digits));
        // Largest and second largest
        int[] largest = largestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second largest: " + largest[1]);
        // Smallest and second smallest
        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second smallest: " + smallest[1]);
        input.close();
    }
}
