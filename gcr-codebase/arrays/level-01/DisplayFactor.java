// Create DisplayFactor to compute and factors and display it
import java.util.Scanner;
public class DisplayFactor{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for finding factors: ");
		int factorNumber = input.nextInt();
		int maxFactor = 10;
		int [] factorArray = new int[maxFactor];
		int index = 0;
		for(int number = 1 ; number <= factorNumber ; number++){
			if(factorNumber % number == 0){
				if(index == maxFactor){
					maxFactor = maxFactor * 2;
					int [] temp = new int[maxFactor];
					
					for(int i = 0 ; i < index ; i++){
						temp[i] = factorArray[i];
					}
					factorArray = temp;
				}
				factorArray[index++] = number;
			}
		}
		
		//print factors
		System.out.println("Factors are: ");
		for( int ind = 0 ; ind < index ; ind++){
			System.out.println(factorArray[ind]);
		}
		input.close();
		
	}

}