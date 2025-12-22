import java.util.Scanner;
public class SubString{
	public static String builtSubString(String string, int start , int end){
		String subString = "";
		for(int index = start ; index <= end&&index < string.length(); index++){
			subString += string.charAt(index);
		}
		return subString;
	}
	public static boolean campareString(String stringOne , String stringTwo){
		if(stringOne.length() != stringTwo.length()){
			return false;
		}
		for(int index = 0 ; index< stringOne.length() ; index++){
			if(stringOne.charAt(index) != stringTwo.charAt(index)){
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String stringOne = input.next();
		System.out.println("Enter the start index from 0 to "+ (stringOne.length()-1));
		int startIndex = input.nextInt();
		System.out.println("Enter the end index from " +startIndex+ " to " +(stringOne.length()-1));
		int endIndex = input.nextInt();
		String subStringOne = builtSubString(stringOne,startIndex,endIndex);
		String subStringTwo = stringOne.substring(startIndex , endIndex+1);
		boolean result = campareString(subStringOne,subStringTwo);
		
		System.out.println("Create using builtSubString method: "+subStringOne);
		System.out.println("Create using built in subString method: " +subStringTwo);
		if(result){
			System.out.println("Both subString is same");
		}
		else{
			System.out.println("Both subString is not same");
		}
		input.close();
		
	}
}