// Create CalculateTotalPrice Class to compute the total pirce 
// where the unitprice and total value is given by user
import java.util.Scanner;

public class CalculateTotalPrice {
    public static void main(String[] args) {
		
		// Create Scanner object and taking input from user and performing operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Price of Iteam : ");
        double  unitprice = input.nextDouble();
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        double total = unitprice*quantity;


       System.out.println("The total purchase price is INR " + total +
						  ", the quantity is " + quantity +
						  ", and unit price is INR " + unitprice);
        input.close();
    }
}
