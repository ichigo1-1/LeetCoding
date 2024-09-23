class Solution {
    int dp[]=new int[51];
    
    public int solve(int i,int n,HashSet<String>hs,String s)
    {
        //base case 
        if(i>=n)
        {
            return 0;
        }
        //check if already processed
        if(dp[i]!=-1)
        {
            return dp[i];//no need to process further
        }
        //skipping the character
        int result=1+solve(i+1,n,hs,s);//adding 1 because 1 character is skipped
        //now if not skipped we try to find in dictonary
        for(int j=i;j<n;j++)
        {
            String current=s.substring(i,j+1);
            if(hs.contains(current))
            {
                int newResult = solve(j + 1, n, hs, s);
                result = Math.min(result, newResult);
            }
        }
        dp[i]=result;//memorise the result
        return result;
    }
    public int minExtraChar(String s, String[] dictionary) {
        Arrays.fill(dp,-1);
        int n=s.length();
        HashSet<String>hs=new HashSet<>();
        for(String st:dictionary){
            hs.add(st);
        }
        return solve(0,n,hs,s);
    }
}