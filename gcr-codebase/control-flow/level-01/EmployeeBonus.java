// Create an EmployeeBonus class to calculate employee bonus
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Check for bonus eligibility
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus applicable.");
        }
        input.close();
    }
}
