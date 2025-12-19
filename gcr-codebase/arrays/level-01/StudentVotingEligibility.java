// Create a StudentVotingEligibility class to check voting eligibility of students based on age
import java.util.Scanner;
public class StudentVotingEligibility {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        //Define constants
        final int numberOfStudents = 10;
        final int votingAge = 18;
        // Declare array to store ages of students.
        int[] studentAges = new int[numberOfStudents];
        // Take age input for each student with validation
        for (int index = 0; index < studentAges.length; index++) {
            System.out.print("Enter age of student " + (index + 1) + ": ");
            int ageInput = input.nextInt();
            // Validate age input
            if (ageInput < 0) {
                System.out.println("Invalid age entered. Age cannot be negative.");
                studentAges[index] = ageInput;
            } else {
                studentAges[index] = ageInput;
            }
        }
		
        System.out.println("\nVoting Eligibility Results:");
        // Loop to check voting eligibility
        for (int index = 0; index < studentAges.length; index++) {
            int currentAge = studentAges[index];
            // Check for invalid age
            if (currentAge < 0) {
                System.out.println("Student with age " + currentAge + " has an invalid age.");
            }
            // Check if student can vote
            else if (currentAge >= votingAge) {
                System.out.println("The student with the age " + currentAge + " can vote.");
            }
            // Student cannot vote
            else {
                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }
        input.close();
    }
}
