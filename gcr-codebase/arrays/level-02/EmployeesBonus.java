// Create EmployeesBonus class to compute the total Bonus Amount of
// ten employe.
import java.util.Scanner;
public class EmployeesBonus {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int [] employeSalary = new int[10];
		int [] employeExp = new int[10];
		int totalBonusAmount = 0;
		//Taking input of salary and experience
		for(int index = 0 ; index < 10 ;index++){
			System.out.println("Enter the salary");
			employeSalary[index] = input.nextInt();
			System.out.println("Enter the year of experience");
		 	employeExp[index] = input.nextInt();
		}
		//Calculating the bonus of every employe
		for(int index = 0; index < 10 ; index++){
			int bonus = 0;
			if(employeExp[index] > 5){
				bonus = (employeSalary[index]*5)/100;
				System.out.println("Old Salary is: " +employeSalary[index] + 
				" new salary is: " + (employeSalary[index] + bonus));
			}
			else{
				bonus = (employeSalary[index]*2)/100;
				System.out.println("Old Salary is: " +employeSalary[index] + 
				" new salary is: " +(employeSalary[index] + bonus));
			}
			totalBonusAmount += bonus;
		}
		
		// print the total bonus
		System.out.println("The bonus is: " +totalBonusAmount);
		input.close();		
	}
}