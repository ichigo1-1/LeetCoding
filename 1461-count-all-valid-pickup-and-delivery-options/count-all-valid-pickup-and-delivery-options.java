class Solution {
    public int countOrders(int n) {
        //if n=1
        //possible order:- p1 d1
        //so base casse if n==1 return 1;

        //for n=2
        //well try to fix p2 in the possible order of n==1
        // __p1__d1__
        //total spaces =3
        //if we fix p2 at first space total combinations= 
        //P2D2P1D1,P2P1D2D1,P2P1D1D2
        //NEXT IF WE FIX P2 AFTER P1(SECOND SPACE)
        //P1P2D2D1,P1P2D1D2
        //LASTLY IF WE FIX AT LAST
        //P1D1P2D2

        //SO TOTAL COMBINATIONS =6
        //WE CAN DERIVE A FORMULA OUT OF IT
        //we need to count just the spaces and get the natural sum of it
        //in the above case space=3 , so applying sum of n natural no spaces*(spaces-1)/2;
        //ans=6

        //same with n==3
        //well try to fix p3 in all the spaces availabale and find the result
        //spaces=5 //result=15
        //as n==2 provided 6 ans 
        //all 6 will produce 6*15=90 

        //do it until n is reached

        // TO GET THE SPACE FORMULA WELL USE :- (N-1)*2+1;

        if(n==1)
        {
            return 1;
        }
        int MOD=1000000007;
        int result=1;
        for(int i=2;i<=n;i++)
        {
            int spaces=(i-1)*2+1;
            int possible_result=spaces*(spaces+1)/2;
             result = (int)((long)result * possible_result % MOD);
        }
        return result;
    }
}