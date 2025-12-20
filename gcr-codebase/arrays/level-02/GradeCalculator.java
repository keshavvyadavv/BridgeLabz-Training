// Create GradeCalculator class to compute the grades using
//single dimension array
import java.util.Scanner;
public class GradeCalculator{
	public static void main(String[] args){
		
		//Create Scanner object 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of student: ");
		int numberOfStudent = input.nextInt();
		//Arrays for marks of physics, chemistry, and maths
		double [] physics = new double[numberOfStudent];
		double [] chemistry = new double[numberOfStudent];
		double [] maths = new double[numberOfStudent];
		double [] percentage = new double[numberOfStudent];
		char [] grades = new char[numberOfStudent];
		int index = 0;
		double value = 0.0;
		// Taking input for user and handling the negative case.
		for(int row = 0 ; row < numberOfStudent; row++){
			while(true){
				System.out.println("Enter the marks of Physics of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.println("Enter valid number: ");
					continue;
				}
				physics[row] = value;
				break;
			}
			while(true){
				System.out.println("Enter the marks of Chemistry of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.println("Enter valid number: ");
					continue;
				}
				chemistry[row] = value;
				break;
			}
			while(true){
				System.out.println("Enter the marks of Maths of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.println("Enter valid number: ");
					continue;
				}
				maths[row] = value;	
				break;
			}		
		}
		// calculating grades based on percentage
		for(int row = 0; row < numberOfStudent; row++){
			double sum = physics[row] + chemistry[row] + maths[row];
			double tempPercentage = sum/3;
			percentage[index] = tempPercentage;
			if(tempPercentage >= 80){
				grades[index] = 'A';
			}
			else if(tempPercentage >= 70){
				grades[index] = 'B';
			}
			else if(tempPercentage >= 60){
				grades[index] = 'C';
			}
			else if(tempPercentage >= 50){
				grades[index] = 'D';
			}
			else if(tempPercentage >= 40){
				grades[index] = 'E';
			}
			else{
				grades[index] = 'R';
			}
			index++;
		}
		
		//print the marks, percentage, and grades
		index = 0;
		for(int row = 0 ; row < numberOfStudent ; row++){
			System.out.println("Marks of physics: "+physics[row]+", chemistry : "+chemistry[row]+", and maths is: " 
								+maths[row]+ " percentage is: "+ percentage[index]+", Grade: "+grades[index]);
			index++;
		}
		input.close();
		
	}
}
