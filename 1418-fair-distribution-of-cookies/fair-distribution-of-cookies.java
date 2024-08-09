class Solution {
    int res=Integer.MAX_VALUE;
    public void solve(int i,int[]cookies,int[]arr,int k)
    {
        //base case 
        if(i>=cookies.length)
        {
            int unfairness=0;
            //compare the greatest
            for(int it:arr)
            {
                unfairness=Math.max(unfairness,it);
            }
            res=Math.min(res,unfairness);
            return;
        }
        //give cookie
        int cookie=cookies[i];
        //now decide which one to give this
        for(int j=0;j<k;j++)
        {
            arr[j]+=cookie;//given
            //explore
            solve(i+1,cookies,arr,k);
            //take back
            arr[j]-=cookie;
        }
    }
    public int distributeCookies(int[] cookies, int k) {
        int n=cookies.length;
        int[]arr=new int[k];
        solve(0,cookies,arr,k);
        return res;
    }
}