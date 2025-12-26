// Create MaxSubArray class that find the largest sum of sub array
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
		
		//initialize the value to Integer.MIN_VALUE
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(maxSum < sum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}