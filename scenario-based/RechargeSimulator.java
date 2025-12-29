//10. Phone Recharge Simulator 📱
//Take the user's mobile operator and amount.
//● Use a switch to display offers.
//● Loop to allow repeated recharges.
//● Show balance after each recharge.

import java.util.Scanner;

public class RechargeSimulator {
    public static void main(String[] args) {
		
		//create the scanner object.
        Scanner input = new Scanner(System.in);
        int balance = 0;
        char choice;
        do {
			
            System.out.println("Enter the mobile operator:");
            System.out.println("a for Airtel, b for Vodafone, c for Idea, d for Jio");
			//ask for operator
            char operator = input.next().charAt(0);
			//amount
            System.out.println("Enter the amount (100, 199, 299): ");
            int amount = input.nextInt();
            balance += amount;
            switch (operator) {
                case 'a':
                    System.out.println("Airtel Offer:");
                    System.out.println("1.5GB/day for 28 days");
                    break;
                case 'b':
                    System.out.println("Vodafone Offer:");
                    System.out.println("2GB/day for 28 days");
                    break;
                case 'c':
                    System.out.println("Idea Offer:");
                    System.out.println("1GB/day + unlimited calls");
                    break;
                case 'd':
                    System.out.println("Jio Offer:");
                    System.out.println("1.5GB/day + free OTT");
                    break;
                default:
                    System.out.println("Invalid operator");
            }
			
			//result
            System.out.println("Current Balance: Rs. " + balance);
            System.out.println("Do you want to recharge again? (y/n)");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Thank you for using Recharge Simulator!");
		input.close();
    }
}
