// Create NumberDigits class  to store digits of a number and
//find largest and second  largest

import java.util.Scanner;
public class NumberDigits {
    public static void main(String[] args){

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        //array size
        int maxDigit = 10;
        //define  an array 
        int [] digits = new  int[maxDigit];
        // index that track array position
        int index = 0;
        // while loop for extract digits from the number and store in array
        while(number != 0){
            digits[index] = number % 10; 
            number = number / 10; 
            index++; 
            if(index == maxDigit){ // 
                break;
            }
        }
        int largest = 0;
        int secondLargest = 0;
        // Loop for finding largest and second largest number
        for(int i = 0; i < index; i++){
            if(digits[i] > largest){
                secondLargest = largest; 
                largest = digits[i]; 
            } else if(digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i]; 
            }
        }

        // Display the results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
        input.close();
    }
}
