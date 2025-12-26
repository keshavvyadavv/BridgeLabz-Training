// Create moveZeroes class that move all the zeros at last 
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
	
	
        int i = 0;
		//swap on the bases of zeroes and non-zeroes
        for(int j = 1  ; j < nums.length ; j++){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            else if(nums[i] != 0 && nums[j] != 0 || nums[i] != 0 && nums[j] == 0){
                i++;
            }
 
        }
        
    }
}