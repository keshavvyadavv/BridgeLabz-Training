import java.util.Scanner;
public class Campare{
	//create method that campareString using charAt
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

	public static void main(String[] args){
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String one: ");
		String stringOne = input.next();
		System.out.println("Enter String two: ");
		String stringTwo = input.next();
		boolean result = campareString(stringOne,stringTwo);
		
		//check the result using built in method
		if(stringOne.equals(stringTwo) != result){
			System.out.println("No, the result is not same.");
		}
		else{
			if(result){
			System.out.println("Yes, the result is same and the string are equal");
			}
			else{
				System.out.println("Yes, the result is same but the string are not equal");
			}
		}
		input.close();
		
	}

}