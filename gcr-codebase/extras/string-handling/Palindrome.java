//create a Palindrome class that check the given string is palindrome or not.
import java.util.Scanner;
public class Palindrome{
	public static boolean checkPalindromicString(String text){
		int end = text.length()-1;
		int start = 0;
		
		while(start < end){
			if(text.charAt(start) != text.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args){
		
		//create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String text = input.next();
		
		//call of get result
		boolean result = checkPalindromicString(text);
		if(result){
			System.out.println("Yes, the string the palindrome.");
		}
		else{
			System.out.println("No, the string is not palindrome.");
		}
		input.close();
	}
}