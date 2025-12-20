//Create DistributeChocolates class to compute the distribution of chocolates
import java.util.Scanner;
public class DistributeChocolates{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int [] result = new int[2];
		result[0] = number%divisor;
		result[1] = number/divisor;
		return result;
	}
	public static void main(String [] args){
		
		//create the Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number is chocolates: ");
		int numberOfChocolates = input.nextInt();
		System.out.println("Enter the number of student: ");
		int numberOfChildren = input.nextInt();
		// create the object of DistributeChocolates
		DistributeChocolates dc = new DistributeChocolates();
		int [] result = dc.findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
		
		System.out.println("Each Children get " + result[1] +", and the remaining chocolates is: "
							+result[0]);
		input.close();
		
	}
}