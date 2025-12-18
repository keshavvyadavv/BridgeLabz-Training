// Create a MultiplicationTable class to print multiplication table from 6 to 9
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
        // Using for loop to print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
		
    }
}
