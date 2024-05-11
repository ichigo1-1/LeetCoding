class Solution {
    public int buyChoco(int[] prices, int money) {
        // int count=0;
        // int initial=money;
        // for(int i=0;i<prices.length;i++)
        // {
        //     if(prices[i]<=money && count<2)
        //     {
        //             count++;
        //             money-=prices[i];
                
        //     }
           
        // }
        // return count==2?money:initial;
        Arrays.sort(prices);
        int count=0;
        int init=money;
        for(int i=0;i<2;i++)
        {
            if(prices[i]<=money && count<2)
            {
                money-=prices[i];
                count++;
            }
        }
        return count==2?money:init;
    }
}