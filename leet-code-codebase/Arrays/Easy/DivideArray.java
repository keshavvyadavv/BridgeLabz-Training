public class DivideArray {
    public boolean divideArray(int[] nums) {
        
        int frequency[] = new int[501];
        for(int i = 0 ; i < nums.length ; i++){
            frequency[nums[i]]++;
        }
        for(int i = 1 ; i < 501 ; i++){
            if(frequency[i]%2 != 0 ){
             return false;
            }
        }       
        return true;
    }
}