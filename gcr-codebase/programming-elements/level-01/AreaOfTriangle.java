// Create AreaOfTriangle class to find area of triangle
import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		System.out.println("Enter Height: ");
		double height = input.nextDouble();
		System.out.println("Enter Base: ");
		double base = input.nextDouble();
		// Calculate the area of triangle
		double area = (base * height ) /2;
		
		// Print the area of triangle
		System.out.println("Area of triangle: " + area);
		input.close();
		
	}
}