//Create VotingElegible class that generate ages ,and print in tabular form
import java.util.Scanner;
public class VotingElegible{
	//method that generate ages
	public static int[] ageGenerator(int numberOfStudent){
		int [] ages = new int[numberOfStudent];
		for(int index = 0 ; index < numberOfStudent ; index++){
			ages[index] = (int)((Math.random()*90)+10);
		}
		return ages;
	}
	//check the eligibility and create the martix
	public static String[][] generateEligibility(int[] numbers){
		String[][] eligibilityTable = new String[numbers.length][2];
		for(int index = 0 ; index < numbers.length ; index++){
			eligibilityTable[index][0] = String.valueOf(numbers[index]);
			if(numbers[index] >= 18){
				eligibilityTable[index][1] = "true";
			}
			else{
				eligibilityTable[index][1] = "false";
			}
		}
		return eligibilityTable;
	}
	//method that display table with ages and eligibility
	public static void displayString(String [][] martix){
		System.out.println("Age \t      eligibility");
		System.out.println("---------------------------------");
	
		for(int index = 0 ; index < martix.length ; index++){
			System.out.println(martix[index][0] +"\t \t"+martix[index][1]);
		}
		
	}
	public static void main(String [] args){
		
		int [] ages = ageGenerator(10);
		String[][] matrixOfAges = generateEligibility(ages);
		//print result
		displayString(matrixOfAges);
	}

}