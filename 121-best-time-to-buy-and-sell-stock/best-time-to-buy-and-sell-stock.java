class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        //int max=0;
        //int buy=0;
        int profit=0;
        //int sell=0;
        for(int i=0;i<prices.length;i++){
            // min=Math.min(prices[i],prices[i-1]);
            //max=Math.max(min,prices[i]);              
            if(min>prices[i]){
                min=prices[i];
            }
            else if(prices[i]-min>profit){
                profit=prices[i]-min;
            }
            //sell=Math.max(buy,prices[i]);
            //profit=sell-buy;
        }
return profit;
        
    }
}