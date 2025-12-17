// Create AreaofTriangle Class to compute the area of triangle
import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
		
		// Create Scanner object and taking input from user and performing operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double base = input.nextDouble();
        System.out.print("Enter height number: ");
        double height = input.nextDouble();
        double area= 0.5*height*base;
        double baseIn = base / 2.54;
        double heightIn = height / 2.54;
        double areaIn = 0.5 * baseIn * heightIn;

        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and sq cm is " + area);
        input.close();
    }
}

