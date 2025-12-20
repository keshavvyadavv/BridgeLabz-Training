//Create a Friends class to find tallest and youngest 
// using methods
import java.util.Scanner;
public class Friends {
	//find the youngest friend
	public static String findYoungest(int[] ages, String[] names) {
		int minAge = ages[0];
		int index = 0;
		for (int i = 1; i < ages.length; i++) {
			if (ages[i] < minAge ) {
				minAge = ages[i];
				index = i;
			}
		}
		return  names[index];
	}
	//find the tallest friend
	public static String findTallest(double[]  heights, String[] names) {
		double maxHeight = heights[0];
		int index = 0;
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] >  maxHeight) {
				maxHeight = heights[i];
				index = i;
			}
		}
		return names[index];
	}
	public static void main(String[] args) {

		// create the scanner object
		Scanner input = new Scanner(System.in);
		String[] names = {"Amar", "Akbar", "Anthony"};
		int[] ages = new int[3];
		double[] heights = new double[3];
		//taking input for age and height
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter age of " + names[i] + ": ");
			ages[i] = input.nextInt();
			System.out.println("Enter height of " + names[i] + ": ");
			heights[i] = input.nextDouble();
		}
		String youngest = findYoungest(ages, names);
		String tallest = findTallest(heights, names);


		// display result
		System.out.println("Youngest friend is: " + youngest);
		System.out.println("Tallest friend is: " + tallest);
		input.close();
		
	}
}
