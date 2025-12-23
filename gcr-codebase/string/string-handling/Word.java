//create Word class that find the longest word in a sentence.
import java.util.Scanner;
public class Word{
	public static String findLongestWord(String string){
		String [] stringArray = string.split(" ");
		String result = "";
		
		for(int index = 0 ; index < stringArray.length ; index++){
			int temp = stringArray[index].length();
			if(temp > result.length()){
				result = stringArray[index];
			}
		}
		return result;
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the text: ");
		String text = input.nextLine();
		String result = findLongestWord(text);
		//print result
		System.out.println(result);
	}
}