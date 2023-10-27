class Solution {
    public int climbStairs(int n) {
    // int memo[]= new int[n+1];
    // int res = rec(memo,n);
    // return res;
        
        if(n<=3)
        {
            return n;
        }
        int a=3;
        int b=2;
        for(int i=0;i<n-3;i++)
        {
            a=a+b;
            b=a-b;
        }
        return a;
    }
//     private static int rec(int[]memo,int n)
//     {
//         if(n<=1)
//         {
//             return 1;
//         }
//         if(memo[n]>0)
//             return memo[n];
//         int op1 = rec(memo,n-1);
//         int op2 = rec(memo,n-2);
//         memo[n]=op1+op2;
//         return op1 + op2;

//     }
}