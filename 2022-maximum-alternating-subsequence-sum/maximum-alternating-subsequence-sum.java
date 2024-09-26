class Solution {
    long[][]dp;
    public long solve(int i,int[]arr,int flag)
    {
        if(dp[i][flag]!=-1)
        {
            return dp[i][flag];
        }
        //base case
        if(i>=arr.length)
        {
            return 0;
        }
        long skip=solve(i+1,arr,flag);//in this case the sign remains same
        long value=arr[i];
        if(flag==0)
        {
            value=-value;
        }
        long take=solve(i+1,arr,1-flag)+value;
        dp[i][flag]=Math.max(take,skip);
        return dp[i][flag];
    }
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        dp = new long[n+1][2]; // only need space for up to nums.length
        for (long[] row : dp) {
            Arrays.fill(row, -1); // initialize dp with -1 for memoization
        }
        return solve(0,nums,1);
    }
}