import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount ");
        double principalAmount = sc.nextDouble();

        System.out.print("Enter Rate of Interest ");
        double rateOfInterest = sc.nextDouble();

        System.out.print("Enter Time in years ");
        double timePeriod = sc.nextDouble();

        double simpleInterest = (principalAmount * rateOfInterest * timePeriod) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
