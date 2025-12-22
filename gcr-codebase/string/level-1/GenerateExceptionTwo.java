import java.util.Scanner;
public class GenerateExceptionTwo{
	public static void findExcpetion(String string){
		System.out.println(string.charAt(string.length()));
	}
	public static void handleExcpetion(String string){
		try{
			System.out.println(string.charAt(string.length()));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException caught!");
		}
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String string = input.next();
		handleExcpetion(string);
		
	}
}