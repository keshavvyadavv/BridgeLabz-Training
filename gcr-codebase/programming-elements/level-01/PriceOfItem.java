// Create a PriceOfItem class input the unit price of an 
// item and the quantity to be bought

import java.util.Scanner;
public class PriceOfItem{
	public static void main(String[] args){
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter unit price: ");
		int unitPrice = input.nextInt();
		System.out.println("Enter quantity: ");
		int quantity = input.nextInt();
		
		// Calculate total price
		int totalPrice = unitPrice * quantity;
		
		// Print total purchase price quantity of item and unit price
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " 
		                    + quantity + "  and unit price is INR " + unitPrice);
		input.close();
	}
}