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
	public static int[] countVowelOrConsonant(String string){
		int vowelCount = 0;
		int consonantCount = 0;
		for(int index = 0 ; index < string.length() ; index++){
			String result = checkVowelOrConsonant(string.charAt(index));
			if(result.equals("Vowel")){
				vowelCount++;
			}
			else if(result.equals("Consonant")){
				consonantCount++;
			}
		}
		return new int[] {vowelCount , consonantCount};
	}
	public static void main(String [] args){
		
		//create scanner object 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = input.nextLine();
		int [] result = countVowelOrConsonant(string);
		//display display
		System.out.println("Count of vowel: "+result[0] + ", Count of consonant: " + result[1]);
		input.close();
	}
}