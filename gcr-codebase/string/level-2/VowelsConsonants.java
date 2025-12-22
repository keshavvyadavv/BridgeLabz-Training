// create a VowelsConsonants class to count and display in tabular formate
import java.util.Scanner;
public class VowelsConsonants {
    //method to check character type
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }
        //check if it is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    //method to find vowels and consonants in a string
    public static String[][] analyzeString(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch); 
        }
        return result;
    }
    //method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
    public static void main(String[] args) {

		//scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String[][] analysis = analyzeString(text);
		
        // Display results
        displayTable(analysis);

        input.close();
    }
}
