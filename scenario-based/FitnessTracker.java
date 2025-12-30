//13. Sandeep’s Fitness Challenge Tracker 🏋️
//♂Each day Sandeep completes a number of push-ups.
//● Store counts for a week.
//● Use for-each to calculate total and average.
//● Use continue to skip rest days.
import java.util.Scanner;
public class FitnessTracker{
	public static void main(String [] args){
		
		//create the scanner object 
		Scanner input = new Scanner(System.in);
		int [] numberOfPushUp = new int[7];
		int sum = 0;
		int restDay = 0;
		double averagePushUp = 0;
		//get and store the numberOfPushUp
		for(int i = 0 ; i < numberOfPushUp.length ; i++){
			System.out.println("Enter the push of "+(i+1) + "th day and enter -1 for rest days: ");
			numberOfPushUp[i] = input.nextInt();
			if(numberOfPushUp[i] == -1){
				restDay++;
			}
		}
		//find the sum of push up
		for(int i = 0 ; i < numberOfPushUp.length ; i++){
			if(numberOfPushUp[i] >= 0){
				sum += numberOfPushUp[i];
			}
		}
		//Average
		averagePushUp = (double)(sum/(numberOfPushUp.length-restDay));
		System.out.println("+--------------------------+");
		System.out.println("| Day | Number Of push-ups |");
		System.out.println("+--------------------------+");
		for(int i = 0 ; i < numberOfPushUp.length ; i++){
			if(numberOfPushUp[i] == -1){
				System.out.printf("|   %-1s |         %-10s |\n",(i+1),"Rest");
				continue;
			}
			System.out.printf("| %-3s |         %-10s |\n",(i+1),numberOfPushUp[i]);
		}
		
		//display result
		System.out.println("+--------------------------+");
		System.out.println("The total push-ups is:" +sum);
		System.out.println("The average push-ups is:" +averagePushUp);
		input.close();
		
	}
}