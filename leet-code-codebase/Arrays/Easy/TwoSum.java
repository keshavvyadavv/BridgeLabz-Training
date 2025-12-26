class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            int sum;
            for(int j = i+1 ; j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    return new int [] {i ,j};
                }
            }
        }
        return new int [] {-1 ,-1};
    }
}