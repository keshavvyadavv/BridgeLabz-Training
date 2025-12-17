// Create FeetToMileYard Class to compute feet to mile and yard
import java.util.Scanner;
public class FeetToMileYard {
    public static void main(String[] args) {
		
		// Create Scanner object and taking input from user and performing operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("Distance in Yards: " + distanceInYards+ " Distance in Miles: " + distanceInMiles);
        input.close();
    }
}
