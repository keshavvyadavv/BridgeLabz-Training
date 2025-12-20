
import java.util.Scanner;
public class NumberAnalysis{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int [] result = new int[2];
		if(number1 >= number2 && number1 >= number3){
			result[0] = number1;
		}else if(number2 >= number1 && number2 >= number3){	
			result[0] = number2;
		}else{
			result[0] = number3;
		}
		if(number1 <= number2 && number1 <= number3){
			result[1] = number1;
		}else if(number2 <= number1 && number2 <= number3){	
			result[1] = number2;
		}else{
			result[1] = number3;
		}
		return result;
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int number1 = input.nextInt();
		System.out.println("Enter the 2nd number: ");
		int number2 = input.nextInt();
		System.out.println("Enter the 3rd number: ");
		int number3 = input.nextInt();
		
		int [] result = findSmallestAndLargest(number1, number2, number3);
		
		System.out.println("The Largest number is: " + result[0]+
						   ", the smallest number is: "+result[1]);
		input.close();
	}

}