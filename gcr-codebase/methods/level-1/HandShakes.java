// Create a HandShakes class to find the total number of handshakes.
import java.util.Scanner;
public class HandShakes{
	public int numberOfHandShakes(int numberOfHandShakes){
		// formula for handshakes
		int totalHandShakes = (numberOfHandShakes*(numberOfHandShakes-1))/2;
		return totalHandShakes;
	}

	public static void main(String [] args){
	
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of student: ");
		int numberOfStudent = input.nextInt();
		HandShakes handshakes = new HandShakes();
		int totalHandShakes = handshakes.numberOfHandShakes(numberOfStudent);
		
		//print the total handshakes
		System.out.println("The number of possible handshakes is: " + totalHandShakes);
		input.close();
		
	}
}