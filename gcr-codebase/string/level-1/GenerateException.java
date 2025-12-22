//generating runtime exception
public class GenerateException{
	//finding exception
	public static void findingException(){
		String text = null;
		System.out.println(text.length());
	}
	//handling exception
	public static void handleException(){
		String text = null;
		try{
			System.out.println(text.length());
		}
		catch(NullPointerException e){
            System.out.println("NullPointerException caught!");
		}
	}
	public static void main(String [] args){
	
		handleException();
		
	}
}