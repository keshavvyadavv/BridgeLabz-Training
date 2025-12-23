//count the vowels and consonants
import java.util.Scanner;
public class Count{
	public static int[] countVowelsAndConsonants(String string){
		int countVowels = 0;		
		int countConsonants = 0;
		for(int index = 0 ; index < string.length(); index++){
		char ch = string.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
				countVowels++;
			}
			else{
				countConsonants++;
			}
		}
		return new int[] {countVowels, countConsonants};
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = input.next();
		
		int [] result = countVowelsAndConsonants(text);
		
		//print
		System.out.println("Vowels: " +result[0] + ", consonants:  " + result[1]);
		
	}
}
