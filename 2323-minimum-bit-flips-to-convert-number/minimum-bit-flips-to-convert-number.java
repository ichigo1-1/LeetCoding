class Solution {
    public int check(int n)
    {
        int c=0;
        while(n>1)
        {
            if(n%2==1)
            {
                c++;
            }
            n=n>>1;
        }
        if(n==1)
        {
            c++;
        }
        return c;
    }
    public int minBitFlips(int start, int goal) {
        int xored=start^goal;
        //count ones
        int count=0;
        // for(int i=0;i<32;i++)
        // {
        //     if(((xored&(1<<i))!=0))
        //     {
        //         count++;
        //     }
        // }
        return check(xored);
    }
}