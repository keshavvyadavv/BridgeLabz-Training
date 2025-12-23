import java.util.Scanner;
public class SubstringOccurances{
	public static int findSubstringOccurance(String string , String subString){
		if(string.length() < subString.length()){
			System.out.println("the substring is longer than string.");
			return -1;
		}
		int count = 0;
		for(int index = 0 ; index < string.length() ; index++){
			if(subString.length() + index > string.length()){
				return count;
			}
			String temp = string.substring(index,index+ subString.length());
			if(temp.equals(subString)){
				count++;
			}
		}
		return count;
	}
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string: ");
		String string = input.next();
		System.out.println("Enter the subString that count you want: ");
		String subString = input.next();
		
		int result = findSubstringOccurance(string,subString);
		System.out.println(result);
	}
}