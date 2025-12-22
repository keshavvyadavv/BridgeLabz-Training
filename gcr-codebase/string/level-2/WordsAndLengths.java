// Create a WordsAndLengths that compute the length of each word
import java.util.Scanner;
public class WordsAndLengths {
    public static int findingLength(String str) {
        int count = 0;
        try {
            while (true) {
                char ch = str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end
        }
        return count;
    }
    //method to split text into words without using split()
    public static String[] splitText(String text) {
        int len = findingLength(text);
        int spaceCount = 0;
        //Count spaces
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int index = 0;
        //store space indexes
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
		// extract words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceCount) ? spaceIndexes[i] : len;
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }
        return words;
    }
    //method to create 2D array of words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        int n = words.length;
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findingLength(words[i]));
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = input.nextLine();
        // Split text into words
        String[] words = splitText(text);
        // Get words with lengths
        String[][] wordLengthArray = wordsWithLengths(words);
		
        // print result
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t" + length);
        }

        input.close();
    }
}
