//create QuadraticEquation to compute the roots
import java.util.Scanner;
public class QuadraticEquation{
	// finding roots
	public static double[] findingRoot(double a , double b , double c){
		double delta = Math.pow(b,2) - 4 * a * c;
		if(delta > 0){
			double [] result = new double[2];
			double root1 = (-b + Math.sqrt(delta)) / (2*a);
			double root2 = (-b - Math.sqrt(delta)) / (2*a);
			result[0] = root1;
			result[1] = root2;
			return result;
		}
		else if(delta == 0){
			double [] result = new double[1];
			double root1 = (-b + Math.sqrt(delta)) / (2*a);
			result[0] = root1;
			return result;
		}
		return new double[0]; 
	}
	public static void main(String[] args){
		
		//create scanner object and taking input of a,b,and c
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a = input.nextDouble();
		System.out.println("Enter second number: ");
		double b = input.nextDouble();
		System.out.println("Enter third number: ");
		double c = input.nextDouble();
		
		double[]result = findingRoot(a,b,c);
		
		// print result
		if(result.length == 2){
			System.out.println("There are two roots: " + result[0]+ " and "+ result[1]);
		}
		else if(result.length == 1){
			System.out.println("There is one root: " + result[0]+ " and "+ result[1]);
		}
		else{
			System.out.println("No roots");
		}
		input.close();
		
	}
}