import java.util.Scanner;
public class NumberSign {
    public int getNumberStatus(int value) {
        if (value  > 0) {
            return 1;
        } 
		else if (value < 0){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {

		// Create the Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = scanner.nextInt();
		NumberSign ns = new NumberSign();
        int status = ns.getNumberStatus(value);
		// checking the status and storing the answer
        String result = "";
        switch (status) {
            case 1:
                result = "Positive";
                break;
            case -1:
                result = "Negative";
                break;
            default:
                result = "Zero";
        }

		// print the result
        System.out.println("The " +value + " is: " +result);
        scanner.close();
		
    }
}
