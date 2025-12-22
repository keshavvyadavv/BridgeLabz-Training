//create Uppercase class to convert uppercase and campare 
import java.util.Scanner;
public class Lowercase {
	public static String convertUppercaseToLowercase(String string){
        String result = "";
		for(char ch : string.toCharArray()){
			int asciiValue = ch;
			if(ch >= 'A' && ch <= 'Z' && ch != ' '){
				result += (char)(ch+32);
			}else{
				result += ch;
			}
		}
		return result;
    }
	public static boolean campareString(String stringOne , String stringTwo){
		if(stringOne.length() != stringTwo.length()){
			return false;
		}
		for(int index = 0 ; index < stringOne.length() ;index++){
			if(stringOne.charAt(index) != stringTwo.charAt(index)){
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args){
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text. ");
		String text = input.nextLine();
		String convertedString = convertUppercaseToLowercase(text);
		System.out.println(convertedString);
		String convertedByBuiltInMethod = text.toLowerCase();
		boolean result = campareString(convertedString,convertedByBuiltInMethod);
		if(!result){
			System.out.println("No, not matching the with built in method");
		}
		else{
			if(result){
				System.out.println("Yes, both the string is matching: "+convertedByBuiltInMethod + " "+convertedString);
			}
		}
		
		
	}

}