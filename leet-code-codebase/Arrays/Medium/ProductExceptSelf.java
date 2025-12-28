//create productExceptSelf that compute Product of Array Except Self 
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
	
        int product = 1;
		//to calculate the product of left and right side
        int [] leftProduct = new int[nums.length];
        int [] rightProduct = new int[nums.length];
		//loop for left side product calculate
        for(int i = 0 ; i < nums.length ; i++){
            leftProduct[i] = product;
            product = product * nums[i];
        }
        product = 1;
		//loop for right side product calculate
        for(int i = nums.length - 1; i >= 0 ; i--){
            rightProduct[i] = product;
            product = product * nums[i];
        }
		//combine and save it in nums as a final answer
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = rightProduct[i] * leftProduct[i];
        }
        return nums;
    }
}