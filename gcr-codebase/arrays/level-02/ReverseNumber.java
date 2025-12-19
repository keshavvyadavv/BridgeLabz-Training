// Create ReverseNumber class to store digits 
//of a number and display in reverse
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int temp = number;
        int count = 0;
		// count the number of  digits
        while(temp != 0){
            temp = temp / 10;
            count++;
        }
        //Create an array to store the digits
        int[] digits = new int[count];
        // Extract digits and store in array
        temp = number;
        for(int i = 0; i < count; i++){
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Display the digits in reverse order
        System.out.print("The reversed number is: ");
        for(int i = 0; i < count; i++){
            System.out.print(digits[i]);
        }
        input.close();
    }
}
