// create Reverse class that reverse the string.
import java.util.Scanner;
public class Reverse{
	//method that just reverse the string.
	public static String findReverse(String string){
		int start = 0;
		int end = string.length()-1;
		String words = "";
		//run reverse loop
		for(int index = end ; index >= 0 ; index--){
			words += string.charAt(index);
		}
		return words;
	}
	public static void main(String[] args){
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string. ");
		String text = input.next();
		
		//print result
		String result = findReverse(text);
		System.out.println("The reverse of " +text + " is " + result);
		input.close();
		
	}
}