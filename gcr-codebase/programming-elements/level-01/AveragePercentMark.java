// Create AveragePercentMark Class to compute the average percent mark 
// of physics, maths, and chemistry.

public class AveragePercentMark{

    public static void main(String[] args){

	// Create a variable name to indicate the name of person.
	String name = "Sam";
	
	// Create a variables mathsMarks, physicsMarks, and chemistryMarks for 
	// subject name maths, physics, and chemistry respectively.
	int mathsMarks = 94 , physicsMarks = 95 , chemistryMarks = 96;	
	
	// Create a variable averagePercent to calculate the average
	double averagePercent = (double)(mathsMarks + physicsMarks + chemistryMarks)/(double)3;
	
	// Print the average percentage.
	System.out.println(name+ "'s average mark in PCM is " +averagePercent);

    }

}