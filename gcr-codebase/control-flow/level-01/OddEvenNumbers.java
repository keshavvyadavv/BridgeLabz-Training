// Create an OddEvenNumbers class to print odd and even numbers
import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
            // for loop to check odd and even numbers
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        input.close();
    }
}
