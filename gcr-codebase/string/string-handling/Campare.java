import java.util.Scanner;
public class Campare{
	public static int findOrder(String first , String second){
		
		int length = Math.min(first.length() , second.length());
		for(int index = 0 ; index < length ; index++){
			if(first.charAt(index) != second.charAt(index)){
				return first.charAt(index) - second.charAt(index);
			}
		}
		return first.length() - second.length();
	}
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String textOne = input.next();
		System.out.println("Enter the second string: ");
		String textSecond = input.next();
		
		int result = findOrder(textOne , textSecond);
		if(result == 0){
			System.out.println("Both the strings is equal.");
		}
		else if(result < 0){
			System.out.println(textOne + " comes first then "+textSecond);
		}
		else{
			System.out.println(textSecond + " comes first then "+textOne);
		}
		input.close();
		
	}
}