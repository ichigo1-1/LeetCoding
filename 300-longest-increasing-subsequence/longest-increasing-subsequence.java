class Solution {
    int[][]dp;;
    public int solve(int i,int p,int n,int[]arr)
    {
        if(p!=-1 && dp[i][p]!=-1)
        {
            return dp[i][p];
        }
        //base case 
        if(i>=n)
        {
            return 0;
        }
        //take condn
        int take=0;
        if(p==-1 || arr[p]<arr[i])
        {
            take=1+solve(i+1,i,n,arr);
        }
        //skip
        int skip=solve(i+1,p,n,arr);
        if(p!=-1)
        {
            dp[i][p]=Math.max(take,skip);
        }
        return Math.max(take,skip);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp=new int[n+1][n+1];
        for(int[]row:dp)
        {
            Arrays.fill(row,-1);
        }
        
        return solve(0,-1,n,nums);
    }
}