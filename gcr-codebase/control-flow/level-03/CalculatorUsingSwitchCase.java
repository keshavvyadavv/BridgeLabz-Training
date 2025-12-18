// Create CalculatorUsingSwitchCase class that calculate using switch-case
import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {

        // Create Scanner object to take input and take first, 
		// second numberand operator as input
		double firstNumber;
        double secondNumber;
        String operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        first = input.nextDouble();
        System.out.println("Enter second number:");
        second = input.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        operator = input.next();

        // Switch-case to for calculation
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second) );
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second ));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second ));
                } else {
                    System.out.println("Division by zero is not allowed. ");
                }
                break;

            default:
                System.out.println("Operator is not valid ");
        }
        input.close();
    }
}