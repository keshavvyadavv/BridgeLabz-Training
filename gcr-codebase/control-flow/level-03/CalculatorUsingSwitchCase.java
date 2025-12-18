// Create CalculatorUsingSwitchCase class that calculate using switch-case
import java.util.Scanner;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {

        // Create Scanner object to take input
        double firstNumber;
        double secondNumber;
        String operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        firstNumber = input.nextDouble();
        System.out.println("Enter second number:");
        secondNumber = input.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        operator = input.next();
		
        // Switch-case for calculation
        switch (operator) {
            case "+":
                System.out.println("Result = " + (firstNumber + secondNumber));
                break;

            case "-":
                System.out.println("Result = " + (firstNumber - secondNumber));
                break;

            case "*":
                System.out.println("Result = " + (firstNumber * secondNumber));
                break;

            case "/":
                if (secondNumber != 0) {
                    System.out.println("Result = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Operator is not valid");
        }
        input.close();
    }
}
