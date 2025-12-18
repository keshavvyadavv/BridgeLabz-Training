// Create a MultiplesBelowHundredWithLoop class to find all multiples of a number below 
//100 using while loop
import java.util.Scanner;

public class MultiplesBelowHundredWithLoop {
    public static void main(String[] args) {

        //create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        // Check whether the number is a positive integer and less than 100.
        if (number <= 0 || number >= 100) {
            System.out.println("Please  enter a valid positive integer less than 100.");
        } else {
            //using while loop to find multiples below 100
            System.out.print(" Multiples of " + number + " below 100 are:  ");
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) {
					
                    System.out.print(counter + " ");
					
                }
                counter--;
            }
        }
        input.close();
    }
}
