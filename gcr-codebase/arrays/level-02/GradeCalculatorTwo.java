//create GradeCalculatorTwo class to compute grades and percentage
//using 2-dimensional array
import java.util.Scanner;
public class GradeCalculatorTwo{
	public static void main(String[] args){
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of student: ");
		int numberOfStudent = input.nextInt();
		double[][] markOfPCM = new double[numberOfStudent][3];
		double [] percentage = new double[numberOfStudent];
		char [] grades = new char[numberOfStudent];
		int index = 0;
		double value = 0.0;
		// take input of marks and store in respective array and handle negative mark case
		for(int row = 0 ; row < numberOfStudent; row++){
			while(true){
				System.out.println("Enter the marks of Physics of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.println("Enter valid number: ");
					continue;
				}
				markOfPCM[row][0] = value;
				break;
			}
			while(true){
				System.out.println("Enter the marks of Chemistry of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.println("Enter valid number: ");
					continue;
				}
				markOfPCM[row][1] = value;
				break;
			}
			while(true){
				System.out.println("Enter the marks of Maths of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.println("Enter valid number: ");
					continue;
				}
				markOfPCM[row][2] = value;	
				break;
			}		
		}
		// compute the grades and percentage and store
		for(int row = 0; row < numberOfStudent; row++){
			double sum = markOfPCM[row][0] + markOfPCM[row][1] + markOfPCM[row][2];
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
		
		// print the marks, percentage, and grades
		index = 0;
		for(int row = 0 ; row < numberOfStudent ; row++){
			System.out.println("Marks of physics: "+markOfPCM[row][0]+", chemistry : "+markOfPCM[row][1]+", and maths is: " 
								+markOfPCM[row][2]+ " percentage is: "+ percentage[index]+", Grade: "+grades[index]);
			index++;
		}
		input.close();
		
	}
}
