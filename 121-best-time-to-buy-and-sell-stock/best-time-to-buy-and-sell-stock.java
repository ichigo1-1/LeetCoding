class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int cur=0;
        int low=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            low=Math.min(low,prices[i]);
            cur=prices[i]-low;
            if(cur>max)
            {
                max=cur;
            }
        }
        return max;
    }
}