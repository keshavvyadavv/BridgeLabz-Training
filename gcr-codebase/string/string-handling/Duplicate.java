import java.util.Scanner;
public class Duplicate{
	public static String removeDuplicate(String string){
		String words = "";
		for(int i = 0 ; i < string.length() ; i++){
			boolean flag = true;
			for(int j = i+1 ; j < string.length(); j++){
				if(i != j && string.charAt(i) == string.charAt(j)){
					flag = false;
				}
			}
			if(flag){
				words+= string.charAt(i);
			}
		}
		return words;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the text: ");
		String text = input.next();
		
		String result = removeDuplicate(text);
		System.out.println("The old string is: "+text + " the updated string is: "+
							result);
		input.close();
	}
}