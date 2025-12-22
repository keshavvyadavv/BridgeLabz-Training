//create GenerateExceptionThree that generate IllegalArgumentException
import java.util.Scanner;
public class GenerateExceptionThree {
    // Method to generate IllegalArgumentException (abrupt termination)
    public static void generateException(String str) {
        int start = 3;
        int end = 1;
        // Manually throwing IllegalArgumentException
        if (start > end) {
            throw new IllegalArgumentException("Start index is greater than end index");
        }
        System.out.println(str.substring(start, end));
    }
    // Method to handle IllegalArgumentException and RuntimeException
    public static void handleException(String str) {
        try {
            int start = 3;
            int end = 1;
            if (start > end) {
                throw new IllegalArgumentException("Start index is greater than end index");
            }
            System.out.println(str.substring(start, end));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught! " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught! " + e.getMessage());
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        // Uncomment to see abrupt termination
        // generateException(str);
        handleException(str);
        input.close();
		
    }
}
