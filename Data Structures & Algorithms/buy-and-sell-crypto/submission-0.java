class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = 0;
        int selling =0;
        int profit =0;
        for(int i=0; i<prices.length; i++){
            buyingPrice = prices[i];
            for(int j=i+1; j<prices.length;j++){
                profit = Math.max(profit, prices[j]-prices[i]);
            }

        }
        return profit;
    }
}
