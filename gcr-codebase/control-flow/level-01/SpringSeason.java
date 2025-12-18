// Create SpringSeason class to check the spring season
import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		
		// Create scanner object and taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month:");
		String month = input.nextLine();
		System.out.println("Enter the day:");
		int day = input.nextInt();
		
		// Print the Season
		if((month.equals("March") && day >= 20 ) || (month.equals("June") && day <= 20) || month.equals("April") || month.equals("May")){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
		input.close();
	}
}