import java.util.Scanner;
public class UniqueCharacter{
	public static int findLength(String string){
		int len = 0;
		try{
			while(true){
				string.charAt(len);
				len++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			
		}
		return len;
	}
	public static char[] findUnique(String text){
		int len = findLength(text);
		char [] unique = new char[len];
		int index = 0;
		//
		for(int i = 0 ; i < len ; i++){
			int count = 0;
			for(int j = 0 ; j < len ; j++){
				if(text.charAt(i) == text.charAt(j)){
					count++;
				}
			}
			if(count == 1){
				unique[index++] = text.charAt(i);
			}
		}
		char [] result = new char[index];
		for(int ind = 0 ; ind < index;ind++){
			result[ind] = unique[ind];
		}
		return result;
		
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = input.next();
		char [] result = findUnique(text);
		
		for(int index = 0 ; index < result.length ; index++){
			System.out.println(result[index] +" ");
		}
		input.close();
	}
}