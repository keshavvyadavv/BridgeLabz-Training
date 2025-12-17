// Create HarryAgeCalculator Class to compute the age of harry

public class HarryAgeCalculator{

    public static void main(String[] args){

	// Create a variable name to indicate name
	String name = "Harry";

	// Create a variable birthYear for birth year
        int birthYear = 2000;

	// Create a variable currentYear for current year
	int currentYear = 2024;
	
	// Create a variable age to calculate the age  
	int age = currentYear - birthYear;

	
	// Print the age of harry
	System.out.println("Harry's age in " +currentYear+ " is " +age);

    }

}