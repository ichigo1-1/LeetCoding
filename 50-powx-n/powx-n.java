class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        double nn=n;
        if(nn<0)
        {
            nn=-1*nn;
        }
        while(nn>0)
        {
            if(nn%2==1)//odd
            {
                ans=ans*x;
                nn=nn-1;
            }
            if(nn%2==0)//even
            {
                x=x*x;
                nn=nn/2;
            }
        }
        if(n<0)
        {
            ans=(double)1.0/(double)ans;
        }
        return ans;
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     double xnm1=myPow(x,n-1);
    //     double xn=xnm1*x;
    //     return xn;
    // }
    }
}