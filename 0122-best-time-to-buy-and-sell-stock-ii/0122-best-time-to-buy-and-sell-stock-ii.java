class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int netPro = 0;
        for(int i = 0; i < n-1; i++){
            if(prices[i] < prices[i+1]){
                int diff = prices[i+1] - prices[i];
                netPro = netPro + diff;
            }
        }
        return netPro;

        // Note:- pehle ek ek ko traverse kro fir agar next element greater rha pehle se fir uska differece uska profit dega fir usko profit me add krte jao







        // =============================first==========
        // int n = prices.length;
        // int Netpro = 0;
        // for(int i = 0; i < n-1; i++){
        //     if(prices[i] < prices[i+1]){
        //         int diff = prices[i+1] - prices[i];
        //         Netpro = Netpro + diff;
        //     }
        // }
        // return Netpro;
    }
}