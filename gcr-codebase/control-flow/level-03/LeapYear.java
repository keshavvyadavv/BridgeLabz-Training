// Create LeapYear class that takes a year as input and 
//outputs the Year is a Leap Year or not a Leap Year. 
import java.util.Scanner;
public class LeapYear{
	public static void main (String[] args){
		
		// Create a Scanner Object and  take input from user
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = input.nextInt();
		
		if ( year >= 1582 ){
			if ( ( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 ) ) {
				System.out.println( year + " is a leap year ");
			}  else {
			    System.out.println( year + " is not a leap year ");
		    }
		} else {
            System.out.println("Leap year calculation is valid only for years from 1582 onwards");
        }
		input.close();

	}
}