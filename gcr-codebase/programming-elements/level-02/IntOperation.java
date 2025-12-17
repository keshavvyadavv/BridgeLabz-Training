// Create IntOperation class to compute operation in int data type
import java.util.Scanner;
public class  IntOperation{
    public static void main(String[] args) {
		
		// Create Scanner object and taking input from user and performing operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int  a = input.nextInt();
         System.out.print("Enter Second Number : ");
        int  b = input.nextInt();
         System.out.print("Enter Third Number : ");
        int  c = input.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
      
        System.out.println("The results of Int Operations are " 
                + result1 + ", "+ result2 + ", " + result3 + ", and " + result4);
		input.close();
				
    }
}
