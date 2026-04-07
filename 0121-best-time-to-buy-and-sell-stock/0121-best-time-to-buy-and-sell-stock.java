class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxP = 0;
        int minP = prices[0];
        for(int i = 0; i < n; i++){
             int currPro = prices[i] - minP;
             minP = Math.min(minP,prices[i]);
             maxP = Math.max(maxP,currPro);
        }
        return maxP;
        
    }
}