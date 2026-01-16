class NumberOfPairs {
    public int[] numberOfPairs(int[] nums) {
        int [] frequency = new int [101];
        int totalPair = 0;
        int remaining = 0;

        for(int num : nums){
            frequency[num]++;
        }

        for(int count : frequency){
            totalPair += count/2;
            remaining += count%2;
        }

        return new int[]{totalPair , remaining};

    }
}