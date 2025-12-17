// Create PerimeterOfSquare Class to compute perimeter of square
import java.util.Scanner;
public class PerimeterOfSquare{
    public static void main(String[] args) {
		
		// Create Scanner object and taking input from user and performing operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side : ");
        double side = input.nextDouble();       
        double perimeter = 4*side;
     
        System.out.println("The length of the side is "+ side +" whose perimeter is "+ perimeter);
		input.close();
    }
}

