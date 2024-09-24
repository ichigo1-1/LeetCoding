class Solution {
    int[]dp=new int[100001];
    public int solve(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
            int result=1+solve(n-i*i);
            min=Math.min(min,result);
        }
        dp[n]=min;
        return min;
    }
    public int numSquares(int n) {
        Arrays.fill(dp,-1);
        return solve(n);
    }
}