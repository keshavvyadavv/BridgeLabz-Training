import java.util.Scanner;
public class OddAndEven{
	public static void main(String [] args){
	
		// Create variable and scanner object
		int size, number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number till you want to know"+ 
						   " even or odd and only enter natural number: ");
		number = input.nextInt();
		// exit if the number is not natural number
		if(number <= 0){
			System.out.println("Enter the valid number.");
			System.exit(0);
		}
		size = number/2 + 1;
		int [] forEvenNumber = new int[size];
		int [] forOddNumber = new int[size];
		int countEven = 0;
		int countOdd = 0;
		// for loop to filling the odd and even number in array
		for(int num = 1 ; num <= number; num++){
			if(num%2 == 0){
				forEvenNumber[countEven++] = num;
			}else{
				forOddNumber[countOdd++] = num;
			}
		}
		
		// Print the Odd and Even number using loops
		System.out.println("The Odd numbers: ");
		for(int index = 0 ; index < countOdd ;index++){
			System.out.println(forOddNumber[index]);
		}
		System.out.println("The even numbers: ");
		for(int index = 0 ; index < countEven ;index++){
			System.out.println(forEvenNumber[index]);
		}
		input.close();
		
	}
}