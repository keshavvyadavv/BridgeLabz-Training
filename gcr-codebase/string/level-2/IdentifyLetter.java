import java.util.Scanner;
public class IdentifyLetter{
	public static String checkVowelOrConsonant(char ch){
		if(ch > 'Z'){
			ch = (char)(ch - 32);
		}
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			return "Vowel";
		}
		else if(ch >= 65 && ch <= 90){
			return "Consonant";
		}
		System.out.println(ch);
		return "Not a letter";
	}
	public static void main(String [] args){
		
		//create scanner object 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = input.next().charAt(0);
		String result = checkVowelOrConsonant(ch);
		
		//display display
		System.out.println(result);
		input.close();
	}
}