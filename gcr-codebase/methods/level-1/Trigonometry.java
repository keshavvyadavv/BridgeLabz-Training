// create Trigonometry class to find sine, cosine, and tangent
import java.util.Scanner;
public class Trigonometry{
	public double[] calculateTrigonometricFunctions(double angle){
		double radians = Math.toRadians(angle);
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tangent = Math.tan(radians);
		return new double[] {sine,cosine,tangent};
	}
	public static void main(String [] args){
		
		// create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the angle in degree: ");
		double angle = input.nextDouble();
		// Trigonometry object to access mathod
		Trigonometry trigoObj = new Trigonometry();
		double [] result = trigoObj.calculateTrigonometricFunctions(angle);
		
		// print
		System.out.println("Sine: "+result[0]);
		System.out.println("Cosine: "+result[1]);
		System.out.println("Tangent: "+result[2]);
		input.close();
		
	}
}	