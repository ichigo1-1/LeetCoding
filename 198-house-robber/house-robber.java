class Solution {
    int[]dp=new int[401];
    public int solve(int i,int[]arr,int n)
    {
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        //base case 
        if(i>=n)
        {
            return 0;
        }
        int steal=arr[i]+solve(i+2,arr,n);
        int skip=solve(i+1,arr,n);
        dp[i]=Math.max(steal,skip);
        return dp[i];
    }
    public int rob(int[] nums) {
        Arrays.fill(dp,-1);
        int n=nums.length;
        return solve(0,nums,n);
    }
}