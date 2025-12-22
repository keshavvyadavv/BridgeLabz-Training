// create convert string to array and compare it.
import java.util.Scanner;
public class ConvertStringToArray{
	public static char[] convertToCharArray(String string){
		char []charString = new char[string.length()];
		for(int index = 0 ; index < string.length() ; index++){
			charString[index] = string.charAt(index);
		}
		return charString;
	}
	public static boolean campareString(char[] stringOne , char[] stringTwo){
		if(stringOne.length != stringTwo.length){
			return false;
		}
		for(int index = 0 ; index< stringOne.length ; index++){
			if(stringOne[index] != stringTwo[index]){
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args ){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string ");
		String string = input.next();
		
		char [] stringArrayUsingLocalMethod = convertToCharArray(string);
		char [] stringArrayUsingBuiltInMethod = string.toCharArray();
		
		boolean result = campareString(stringArrayUsingBuiltInMethod,stringArrayUsingLocalMethod);
		System.out.println("Result using local method: ");
		for(int index = 0; index < stringArrayUsingLocalMethod.length ;index++){
			System.out.println(stringArrayUsingBuiltInMethod[index] + " ");
		}
		System.out.println("Result using toCharArray method: ");
		for(int index = 0; index < stringArrayUsingBuiltInMethod.length ;index++){
			System.out.println(stringArrayUsingBuiltInMethod[index] + " ");
		}
		if(result){
			System.out.println("Yes, both string arrays same");
		}
		else{
			System.out.println("No, both string arrays not same");
		}
		input.close();
	}
}