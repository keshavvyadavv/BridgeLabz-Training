// Create BMI class to compute the weight, height, and BMI
import java.util.Scanner;
public class BMI{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of person: ");
		int numberOfPerson = input.nextInt();
		double [] weights = new double[numberOfPerson];
		double [] heights = new double[numberOfPerson];
		String [] bmiOfPerson = new String[numberOfPerson];
		// input of height, weight and store it in weights and heights
		for(int index = 0; index < numberOfPerson ; index++){
			System.out.println("Enter the weight in kg of " + (index+1)+ "th person: ");
			weights[index] = input.nextDouble();
			System.out.println("Enter the height in meters of " + (index+1)+ "th person: ");
			heights[index] = input.nextDouble();
		}
		//Calculate BMI status
		for(int index = 0 ; index < numberOfPerson ; index++){
			double bmiNumber = weights[index]/(heights[index]*heights[index]);
			if(bmiNumber <= 18.4){
				bmiOfPerson[index] = "Underweight";
			}
			else if(bmiNumber <= 24.9){
				bmiOfPerson[index] = "Normal";
			}
			else if(bmiNumber <= 39.9){
				bmiOfPerson[index] = "Overweight";
			}
			else{
				bmiOfPerson[index] = "Obese";
			}
		}
		
		// Print the height, weight, and  BMI status
		for(int index = 0 ; index < numberOfPerson ; index++){
			System.out.println("The height is : " + heights[index]+ 
			" m, weight is: " +weights[index]+ " kg, the BMI status is: "+ 
			bmiOfPerson[index]);
		}
		input.close();
		
	}
}