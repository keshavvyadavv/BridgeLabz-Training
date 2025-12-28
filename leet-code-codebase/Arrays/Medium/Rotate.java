// create Rotate class that rotate the array right side by k places
public class Rotate {
    public void rotate(int[] nums, int k) {
        //taking the remainder with the side of array
        k = k%nums.length;
        if(nums.length == 0 || nums.length == 1 || k == 0){
            return;
        }
        // reverse with different different points.
        reverse(nums, nums.length - k , nums.length - 1);
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, 0, nums.length - 1);
    }
    //it reverse the array
    public void reverse(int [] nums , int left , int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}