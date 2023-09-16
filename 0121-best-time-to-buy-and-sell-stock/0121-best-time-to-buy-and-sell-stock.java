class Solution {
    public int maxProfit(int[] prices) {
    if(prices.length==0)
            return 0;
        int min=prices[0];
        int profit;
        int max=0;
        
        
      
    for(int i=0;i<prices.length;i++)    
    {
        min=Math.min(prices[i],min);
        profit=prices[i]-min;
        max=Math.max(profit,max);
        
    }
        return max;
    }
}