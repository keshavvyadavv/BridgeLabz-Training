//create GenerateExceptionFour class to handler ArrayIndexOutOfBoundsException
import java.util.Scanner;
public class GenerateExceptionFive{
	public static void generateException(int [] numbers){
        int temp = numbers[numbers.length];
    }
	public static void handlerException(int [] numbers){
		try{
			int temp = numbers[numbers.length];
		}
		catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught! " + e.getMessage());
		}
    }
	public static void main(String[] args){
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of element in array ");
		int number = input.nextInt();
		int [] numbers = new int[number];
		for(int index = 0 ; index < number;index++){
			System.out.println("Enter the " + (index+1) + " number");
			numbers[index] = input.nextInt();
		}
		//generate ArrayIndexOutOfBoundsException
		//generateException(numbers);
		//handle exception
		handlerException(numbers);
		
	}

}