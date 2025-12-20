//Create RemainderAndQuotient class to get reminder and quotient
import java.util.Scanner;
public class RemainderAndQuotient{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int [] result = new int[2];
		result[0] = number%divisor;
		result[1] = number/divisor;
		return result;
	}
	
	public static void main(String [] args){
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		System.out.println("Enter the divisor: ");
		int divisor = input.nextInt();
		// create the object of RemainderAndQuotient
		RemainderAndQuotient remainderAndQuot = new RemainderAndQuotient();
		int [] result = findRemainderAndQuotient(number , divisor);
		
		// print the remainder and quotient 
		System.out.println("The remainder is: "+result[0]+ ", the quotient is :"
							+ result[1]);
		input.close();
	}
}