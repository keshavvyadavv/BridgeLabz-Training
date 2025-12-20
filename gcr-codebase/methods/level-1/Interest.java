//Create SimpleInterest class to find the simple interest
import java.util.Scanner;
public class Interest{
	public double simpleInterest(double principal, double rate, double time){
		
		//formula for simple interest
		double simpleInterest = (principal*rate*time)/100;
		return simpleInterest;
		
	}
	public static void main(String[] args){
	
		// Create Scanner object 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		double principal = input.nextDouble();
		System.out.println("Enter the rate of interest: ");
		double rateOfInterest = input.nextDouble();
		System.out.println("Enter the time duration: ");
		double time = input.nextDouble();
		// Create Interest object 
		Interest interest = new Interest();
		// calling simpleInterest method using interest
		double result = interest.simpleInterest(principal , rateOfInterest,time);
		
		// print the simple interest
		System.out.println( "The Simple Interest is: " +result+" for Principal "+principal+
		", Rate of Interest: " +rateOfInterest+" and Time "+time);
		input.close();	
	}
}