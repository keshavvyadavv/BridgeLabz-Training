//8. Shopkeeper’s Discount Dashboard 🛍️
//A shopkeeper gives discounts based on total bill:
//● Input item prices in a for-loop.
//● Use if-else for discount logic.
//● Use proper indentation, constants, and comments.
import java.util.Scanner;

public class DiscountDashboard {
	public static void main(String[] args) {
		
		String[] items = {"Rice", "Wheat Flour (Atta)", "Milk", "Cooking Oil", "Sugar", "Pulses (Dals)", "Tea", "Toiletries (Soap)", "Biscuits", "Spices (Tumeric)"};
		//initialized with a size
		double[] prices = new double[10];
		double[] discountPrice = new double[10];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < items.length; i++) {
			System.out.println("Enter the price of " + items[i]);
			prices[i] = input.nextDouble();
		}
		for (int i = 0; i < 10; i++) {

			if (prices[i] <= 100) {
				discountPrice[i] = prices[i] - (prices[i] * 0.10);

			} else if (prices[i] <= 500) {
				discountPrice[i] = prices[i] - (prices[i] * 0.20);

			} else {
				discountPrice[i] = prices[i] - (prices[i] * 0.25);
			}
		}

		double sum = 0;
		double realsum = 0;
		System.out.println("---------------------------------------------");
		System.out.printf("%-20s %-10s %-15s%n", "Item", "Price", "After Discount");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.printf(
				"%-20s %-10.2f %-15.2f%n",
				items[i],
				prices[i],
				discountPrice[i]
			);

			sum += prices[i];
			realsum += discountPrice[i];
		}

		System.out.println("---------------------------------------------");
		System.out.printf("Total Price: Rs %.2f%n", sum);
		System.out.printf("Discounted Total: Rs %.2f%n", realsum);
		input.close();
	}
}
