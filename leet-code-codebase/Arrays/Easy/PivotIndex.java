//create PivotIndex class that give the index from which it's both side is 
// having equals sum of element
public class PivotIndex {
    public int pivotIndex(int[] nums) {

        int [] right = new int[nums.length];
        int [] left = new int[nums.length];
        int sum = 0;
        //calculate the sum of left strictly
        for(int i = 0 ; i < nums.length ; i++){
            left[i] = sum; 
            sum += nums[i];
        }
        sum = 0;
        //calculate the sum of right strictly
        for(int i = nums.length - 1; i >= 0 ; i--){
            right[i] = sum; 
            sum += nums[i];
        }
        //match is same then that will be the index
        for(int i = 0 ; i < nums.length ; i++){
            if(left[i] == right[i]){
                return i;
            }
        }
        //if no index found where both side equal sum then return -1
        return -1;
    }
}