// Create MeanHeight class to compute the mean height of football team.
import java.util.Scanner;
public class MeanHeight{
	public static void main(String[] args){
		
		// Create object and taking input from user
		Scanner input = new Scanner(System.in);
		int numberOfPlayers = 11;
		double [] heights = new double[numberOfPlayers];
		double sum = 0.0;
		// For loop for taking height from user and adding it in sum
		for(int index = 0 ; index <= 10 ; index++){
			System.out.println("Player " +(index+1) +"th enter your height");
			heights[index] = input.nextDouble();
			sum = sum + heights[index];
		}
		
		//Print the mean height
		System.out.println("The mean height of the football team is: " +(sum/numberOfPlayers));
		input.close();
		
	}
}