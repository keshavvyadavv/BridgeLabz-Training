import java.util.Scanner;
public class Length{
	public static int findingLength(String string){
		int count =  1;
		try{
			while(true){
				char ch = string.charAt(count);
				count++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException caught!" + e.getMessage());
		}
		return count;
	}
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = input.nextLine();
		int result = findingLength(text);
		int builtInLength = text.length();
		System.out.println("Local method length: "+result);
		System.out.println("Built in length:  " + builtInLength);
	}
}