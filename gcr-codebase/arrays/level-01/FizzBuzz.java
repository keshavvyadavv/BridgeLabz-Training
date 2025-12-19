//Create FizzBuzz class and insert "FizzBuzz" , "Fizz", "Buzz" based on 
// number divisibility and 3 and 5
import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		
		
		// Create Scanner object and taking number as a input for user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		String [] result = new String[number];
		// for loop for filling the result array based on divisibility
		for(int counter = 1 ; counter <= number ; counter++){
			if(counter%3 == 0 && counter%5 == 0){
				result[counter-1] = "FizzBuzz";
			}
			else if(counter%3 == 0){
				result[counter-1] = "Fizz";
			}
			else if(counter%5 == 0){
				result[counter-1] = "Buzz";
			}
			else{
				result[counter-1] = String.valueOf(counter);
			}
		}
		
		
		// Print result
		for(int index = 0 ; index < result.length ;index++){
			System.out.println("Position "+ (index+1) + " = " +result[index]);
		}
		input.close();		
	}
}