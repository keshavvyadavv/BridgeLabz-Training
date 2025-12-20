//create BMI to compute the body mass index based on height weight 
// and printing the bmi status of 10 person
import java.util.Scanner;
public class BMI {
    //calculate BMI
    public static void calculateBMI(double[][] measurement) {
        for (int i = 0; i < 10; i++) {
            double weight = measurement[i][0];
            double heightCm = measurement[i][1];
            double heightM = heightCm / 100;
            measurement[i][2] = weight / (heightM * heightM);
        }
    }
    //get BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
		
		// create the object of scanner
        Scanner input = new Scanner(System.in);
        double[][] measurement = new double[10][3];
		// storing the input in measurement
        for (int i = 0; i < 10; i++) {
            System.out.println(" enter details for person  " + (i + 1));
            System.out.print("weight in kg: ");
            measurement[i][0] = input.nextDouble();
            System.out.print(" height in cm: ");
            measurement[i][1] = input.nextDouble();
        }
        // Calculate BMI
        calculateBMI(measurement);

        // Output (ONE sout per person)
        for (int i = 0; i < 10; i++) {
            System.out.println("person " + (i + 1) +" weight: " + measurement[i][0] + " kg" +
                " height: " + measurement[i][1] + " cm" +
                " bmi: " + String.format("%.2f", measurement[i][2]) +
                " status: " + getBMIStatus(measurement[i][2])
            );
        }

        input.close();
    }
}
