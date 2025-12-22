import java.util.Scanner;
public class Space{
	public static int[] removeLeadingAndTrailingSpace(String string){
		int start = 0;
		int end = 0;
		for(int index = 0 ; index < string.length() ; index++){
			if(string.charAt(index) != ' '){
				start = index;
				break;
			}
		}
		for(int index = string.length() -1 ; index >= 0 ; index--){
			if(string.charAt(index) != ' '){
				end = index;
				break;
			}
		}
		return new int[] {start , end};
	}
	public static String createString(String string , int start , int end){
		if(start == end){
			return "";
		}
		String result = "";
		for(int index = start ; index <= end ; index++){
			result += string.charAt(index);
		}
		return result;
	}
	public static boolean campareString(String stringOne , String stringTwo){
		if(stringOne.length() != stringTwo.length()){
			return false;
		}
		for(int index = 0 ; index < stringOne.length() ; index++){
			if(stringOne.charAt(index) != stringTwo.charAt(index)){
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args){
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = input.nextLine();
		int[] startAndLast = removeLeadingAndTrailingSpace(string);
		String myString = createString(string ,startAndLast[0] , startAndLast[1]);
		String inBuiltTrimMethod = string.trim();
		boolean result = campareString(myString , inBuiltTrimMethod);
		
		//input
		System.out.println(result ? "Yes, both are equal" : "No, not equal");
		input.close();
	
	}
}