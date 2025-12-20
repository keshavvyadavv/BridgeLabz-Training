// create class NaturalNumber to calculate the sum
import java.util.Scanner;
public class NaturalNumber{
	public static int sumOfNaturalNumberUsingRecursion(int number){
		if(number == 1){
			return 1;
		}
		return number + sumOfNaturalNumberUsingRecursion(number-1);
	}
	public static int sumOfNaturalNumber(int number){
		return (number*(number+1))/2;
	}
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		int number;
		while(true){
			System.out.println("Enter the number: ");
			int value = input.nextInt();
			if(value > 0){
				number = value;
				break;
			}
		}
		
		int sumOne = sumOfNaturalNumberUsingRecursion(number);
		int sumTwo = sumOfNaturalNumber(number);
		//print result
		if(sumOne == sumTwo){
			System.out.println("Correct");
		}else{
			System.out.println("Incorrect");
		}
		input.close();
	}
}