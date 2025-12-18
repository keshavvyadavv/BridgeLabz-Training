// Create a RocketLaunch class to print the count down
import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args) {
	
		// Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
