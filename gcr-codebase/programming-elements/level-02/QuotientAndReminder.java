// Create QuotientAndReminder Class to compute the quotient and reminder of two number
import java.util.Scanner;
public class  QuotientAndReminder{
    public static void main(String[] args) {
		
		// Create Scanner object and taking input from user and performing operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int  first = input.nextInt();
         System.out.print("Enter Second Number : ");
        int second = input.nextInt();
        double quotient = first/second;
        double reminder = first%second;

       System.out.println("The Quotient is "+quotient +" and Reminder is "+ reminder 
							+ " of two number "+ first+" and "+ second);
        input.close();
		
    }
}
