// Create ReverseString class that reverse the char [] array
public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        // using two pointer approach 
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}