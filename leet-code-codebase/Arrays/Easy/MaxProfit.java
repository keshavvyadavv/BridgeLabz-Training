class MaxProfit {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            int sell = prices[i] - buy;
            if(prices[i] < buy){
                buy = prices[i];
            }
            if(profit < sell){
                profit = sell;
            }
        }
        return profit;
    }
}