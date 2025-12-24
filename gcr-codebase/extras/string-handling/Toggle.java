import java.util.Scanner;
public class Toggle{
	public static String convertInUppercase(String string){
		String result = "";
		for(int index = 0 ; index < string.length() ; index++){
			if(string.charAt(index) >= 'a' && string.charAt(index) <= 'z'){
				result += (char)(string.charAt(index) - 32);
			}
			else{
				result += string.charAt(index);
			}
		}
		return result;
	}
	public static String convertInLowercase(String string){
		String result = "";
		for(int index = 0 ; index < string.length() ; index++){
			if(string.charAt(index) >= 'A' && string.charAt(index) <= 'Z'){
				result += (char)(string.charAt(index) + 32);
			}
			else{
				result += string.charAt(index);
			}
		}
		return result;
	}
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = input.next();
		
		String upperCase = convertInUppercase(text);
		String lowerCase = convertInLowercase(text);
		
		System.out.println(upperCase + " " + lowerCase);
	}
}