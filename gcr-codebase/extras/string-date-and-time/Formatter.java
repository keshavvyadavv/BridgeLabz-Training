//Create Formatter class that convert string in different-different formate.
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class Formatter{
	public static void findFormat(){
		LocalDate today = LocalDate.now();
		//create the fomate
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		//print the format using today 
		System.out.println("Format 1: "+today.format(f1));
		System.out.println("Format 1: "+today.format(f2));		
		System.out.println("Format 1: "+today.format(f3));
				
	}
	public static void main(String [] args){
		//it display all the format
		findFormat();
	}
}