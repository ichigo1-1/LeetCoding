class Solution {
    public int count(int n)
    {
        int count=0;
        while(n>1)
        {
            // if(n%2==1)
            // {
            //     count++;
            // }

            count+=n&1;//to check odd or even agar odd toh 1 else 0
            // n=n/2;
            //can use right shift
            n=n>>1;
        }
        if(n==1)
        {
            count++;
        }
        return count;
    }
    public int minBitFlips(int start, int goal) {

        int res=start^goal;
        return count(res);

        
    }
}