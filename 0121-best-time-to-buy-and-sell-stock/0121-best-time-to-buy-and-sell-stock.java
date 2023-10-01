class Solution {
    public int maxProfit(int[] prices) {
//    if(prices.length==0)
//         return 0;
        
//         int min=prices[0];
//         int profit;
//         int max=0;
        
//         for(int i=0;i<prices.length;i++)
//         {
//             min=Math.min(min,prices[i]);
//             profit=prices[i]-min;
//             max=Math.max(profit,max);
//         }
//         return max;
        
        if(prices.length==0)
            return 0;
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        
        //FIND THE SMALLEST BUYING DATE
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
        
        int currentProfit = prices[i]-min;
        
        if(currentProfit>maxProfit)
        {
            maxProfit=currentProfit;
        }
        }
        return maxProfit;
}
}