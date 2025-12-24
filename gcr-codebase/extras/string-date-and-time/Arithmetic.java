//create arithmetic class that done some arithmetic operationOnDate.
import java.util.Scanner;
import java.time.LocalDate;
public class Arithmetic{
	public static void operationOnDate(String inputDate){
		try{
			LocalDate date = LocalDate.parse(inputDate);
			LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
			LocalDate finalDate = newDate.minusWeeks(3);
			System.out.println("Original Date: "+date + " Final Date: "+finalDate );
		}
		catch(java.time.format.DateTimeParseException e){
			System.out.println("Enter valid Date in  proper formate"+e.getMessage());
		}
	}
	public static void main(String[] args){
	
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the date(YYYY-MM-DD): ");
		String inputDate = input.nextLine();
		
		//print result
		operationOnDate(inputDate);
		input.close();
	}
}