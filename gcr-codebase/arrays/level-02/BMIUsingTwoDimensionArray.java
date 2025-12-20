// Create BMIUsingTwoDimensionArray class to compute the BMI using 
// two dimension array
import java.util.Scanner;
public class BMIUsingTwoDimensionArray{
	public static void main(String[] args){
		
		// Create Scanner object and taking input of height and weight for user.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of person: ");
		int numberOfPerson = input.nextInt();
		double [][] personData  = new double[numberOfPerson][3];
		String [] weightStatus = new String[numberOfPerson];
		double value;
		int index = 0;
		//storing the height and weight in personData array and handling negative case
		for(int row = 0 ; row < numberOfPerson; row++){
			while(true){
				System.out.println("Enter the number weight in kg of "+(row+1)+"th person");
				value = input.nextDouble();
				if(value > 0){
					break;
				}
				System.out.println("Enter the valid number that must be positive");
			}
			personData[row][0] = value;
			while(true){
				System.out.println("Enter the number height in meter of "+(row+1)+"th person");
				value = input.nextDouble();
				if(value > 0){
					break;
				}
				System.out.println("Enter the valid number that must be positive");
			}
			personData[row][1] = value;
		}
		// computing and storing the BMI status in weightStatus array
		for(int row = 0 ; row < numberOfPerson; row++){
			double tempBMIValue = personData[row][0]/(personData[row][1]*personData[row][1]);
			personData[row][2] = tempBMIValue;
			if(tempBMIValue <= 18.4){
				weightStatus[index++] = "Underweight";
			}
			else if(tempBMIValue <= 24.9){
				weightStatus[index++] = "Normal";
			}
			else if(tempBMIValue <= 39.9){
				weightStatus[index++] = "Overweight";
			}
			else{
				weightStatus[index++] = "Obese";
			}
		}
		
		//print the weight status, height, and weight.
		index = 0;
		for(int row = 0; row < numberOfPerson; row++){
			System.out.println("Height is: "+personData[row][1]+" kg, Weight is: "+
								personData[row][0]+" meter, BMI is: "+personData[row][2]+
								" ,weight status is: "+weightStatus[index++]);
		}
		input.close();
	}
}