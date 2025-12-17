// Create DoubleOperation Class to compute operation with double data type
import java.util.Scanner;
public class  DoubleOperation{
    public static void main(String[] args) {
		
		// Create Scanner object and taking input from user and performing operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double  a = input.nextDouble();
        System.out.print("Enter Second Number : ");
        double  b = input.nextDouble();
        System.out.print("Enter Third Number : ");
        double c = input.nextDouble();
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Int Operations are " 
                + result1 + ", "+ result2 + ", "+ result3 + ", and "+ result4);
		input.close();
    }   
}
