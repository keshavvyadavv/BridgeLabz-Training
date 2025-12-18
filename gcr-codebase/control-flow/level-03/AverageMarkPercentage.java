// Create AverageMarkPercentage class that take input marks of Physics, Chemistry 
// and Maths and print grade based on percentage

import java.util.Scanner;
public class AverageMarkPercentage {
    public static void main(String[] args) {
		
        // Create Scanner object take marks as input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Physics marks:");
        int physicsMarks = input.nextInt();
        System.out.println("Enter Chemistry marks:");
        int chemistryMarks = input.nextInt();
        System.out.println("Enter Maths marks:");
        int mathsMarks = input.nextInt();
        // Calculate percentage
        double percentage = ((physicsMarks + chemistryMarks + mathsMarks) / 300.0) * 100;
        // Print grade
        if (percentage >= 80) {
            System.out.println("Level 4, above agency-normalized standards");
        } 
        else if (percentage >= 70) {
            System.out.println("Level 3, at agency-normalized standards");
        } 
        else if (percentage >= 60) {
            System.out.println("Level 2, below agency-normalized standards");
        } 
        else if (percentage >= 50) {
            System.out.println("Level 1, well below agency-normalized standards");
        } 
        else {
            System.out.println("Remedial standards");
        }
        input.close();
    }
}