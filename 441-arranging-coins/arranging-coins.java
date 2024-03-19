class Solution {
    public int arrangeCoins(int n) {
        int count=n;
        int ans=-1;
        for(int i=1;i<=n;i++)
        {
            count=count-i;
            if(count>=0)
            {
                ans=i;
            }
            else{
                break;
            }
        }
        return ans;
        
    }
}