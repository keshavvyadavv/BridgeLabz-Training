// Create LargestAndSecondLargestTwo to compute the largest and second largest
//and increase the size of array when index is equal to maxDigit by twice
import java.util.Scanner;
public class LargestAndSecondLargestTwo {
    public static void main(String[] args) {
         
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  the number: ");
        String number = input.next();   
        int maxDigit = 10;
        int[] array = new int[maxDigit];
        int index = 0;
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        //store digits in array
        for (int i = number.length() - 1; i >= 0; i--) {
            if (index == maxDigit) {
                maxDigit = maxDigit * 2;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < array.length; j++) {
                    temp[j] = array[j];
                }
                array = temp;
            }
            array[index] = number.charAt(i) - '0';
            index++;
        }
        for (int i = 0; i < index; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } 
            else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

		// print the largest and secondLargest
        System.out.println("Largest digit is = " + largest);
        System.out.println("Second Largest digit is = " + secondLargest);
        input.close();
    }
}