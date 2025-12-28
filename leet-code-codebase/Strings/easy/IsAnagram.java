//Create IsAnagram class that check the two given string is having 
// identical character irrespective of position of character.
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int [] frequency = new int[27];
        //add frequency of s by substracting 97
        for(int i = 0 ; i < s.length() ; i++){
            frequency[s.charAt(i) - 97]++;
        }
        //add frequency of t by substracting 97
        for(int i = 0 ; i < t.length() ; i++){
            frequency[t.charAt(i)-97]--;
        }
        //check any letter persent or not
        for(int i = 0 ; i < frequency.length ; i++){
            if(frequency[i] != 0){
                return false;
            }
        }
        return true;
    }
}