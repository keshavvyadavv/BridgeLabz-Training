// Create a FrequencyOfDigit class to compute frequency of digit 
// of a number given by user
import java.util.Scanner;
public class FrequencyOfDigit{
	public static void main(String [] args){
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		int count = 0, clone = number, index = 0;
		//count the number of digit in input number
		if(number == 0){
			count = 1;
		}
		else{
			while(clone != 0){
			count++;
			clone /= 10;
			}
		}
		int [] digitArray = new int[count];
		int [] frequencyArray = new int[10];
		//store the digit in digitArray
		if(number == 0){
			digitArray[0] = 0;
		}
		else{
			while(number != 0){
				int lastDigit = number%10;
				digitArray[index] = lastDigit;
				index++;
				number = number/10;
			}
		}
		
		//finding the frequency of each digit
		for(index = 0; index < count ;index++){
			frequencyArray[digitArray[index]]++;
		}
		
		// print the frequency of digit
		for(index = 0; index < 10 ; index++){
			if(frequencyArray[index]!=0){
				System.out.println("The frequency of " +index+ " is: " +frequencyArray[index]);
			}
		}
		input.close();
		
	}
}