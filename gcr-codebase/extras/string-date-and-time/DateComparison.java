import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison{
	public static void showCamparision(String dateOne , String dateTwo){
		LocalDate firstDate = LocalDate.parse(dateOne);
		LocalDate secondDate = LocalDate.parse(dateTwo);
		
		if(firstDate.isBefore(secondDate)){
			System.out.println(dateOne + " is come before "+secondDate);
		}
		else if(firstDate.isAfter(secondDate)){
			System.out.println(dateOne + " is come after "+secondDate);
		}
		else{			
			System.out.println(dateOne + " is equal to "+secondDate);
		}
	}
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dateOne(yyyy-MM-dd): ");
		String inputDateOne = input.nextLine();
		System.out.println("Enter the dateTwo(yyyy-MM-dd): ");
		String inputDateTwo = input.nextLine();
		//print result
		showCamparision(inputDateOne,inputDateTwo);
		input.close();
	}
}