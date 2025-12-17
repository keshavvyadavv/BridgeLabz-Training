// Create PenDistribution Class to compute distribution of pen

public class PenDistribution{
    public static void main(String [] args){
		// Create a variablem numberOfPen for count of pen
		int numberOfPen = 14;
		
		// Create a variable numberOfStudent for number of student
		int numberOfStudent = 3;
		
		// Create a variable remainingPen for remaining number of pen
		int remainingPen = numberOfPen%numberOfStudent;
		
		// Create a variable equallyDivided for equal distribution
		int equallyDivided = numberOfPen/numberOfStudent;
		
		// Print the number of reamining pen and distributed pen
		System.out.println("The Pen Per Student is " +equallyDivided+ " and the remaining pen not distributed is " +remainingPen);
		
    }
}