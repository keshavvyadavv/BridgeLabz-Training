//create GenerateExceptionFour class to handler NumberFormatException
import java.util.Scanner;
public class GenerateExceptionFour{
	public static void generateException(String str){
        Integer.parseInt(str);
    }
	public static void handlerException(String str){
		try{
			Integer.parseInt(str);
		}
		catch(NumberFormatException e){
            System.out.println("NumberFormatException caught! " + e.getMessage());
		}
    }
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = input.next();
		//generate NumberFormatException
		//generateException(string);
		//handle exception
		handlerException(string);
		
	}

}