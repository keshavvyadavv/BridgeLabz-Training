//create a SplitText class to compute text to word
import java.util.Scanner;
public class TextToWord {
    //method to find length of string without using length()
    public static int findingLength(String str) {
        int count = 0;
        try {
            while (true) {
                char ch = str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught! " + e.getMessage());
        }
        return count;
    }
    //words without using split
    public static String[] splitText(String text) {
        int len = findingLength(text);
        int spaceCount = 0;
        // Count spaces to determine number of words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;
        // Store space indexes
        int[] spaceIndexes = new int[spaceCount];
        int index = 0; 
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        // Extract words using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i < spaceCount) {
                end = spaceIndexes[i];
            } else {
                end = len;
            }
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1; 
        }
        return words;
    }
    //compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = input.nextLine();
        String[] customWords = splitText(text);
        String[] builtinWords = text.split(" ");
        // Display words
        System.out.println("Custom split method:");
        for (String w : customWords) {
            System.out.println(w);
        }
        System.out.println("\nBuilt-in split method:");
        for (String w : builtinWords) {
            System.out.println(w);
        }
		
        // Compare the two arrays and print result
        boolean result = compareStringArrays(customWords, builtinWords);
        System.out.println("\nAre the two arrays equal? " + result);
        input.close();
    }
}
