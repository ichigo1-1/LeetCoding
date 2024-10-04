class Solution {
   public int check(int n) {
    int c = 0;
    while (n > 0) {
        // If the rightmost bit is 1, increment the count
        if ((n & 1) == 1) {
            c++;
        }
        // Shift n to the right by 1 bit (equivalent to dividing by 2)
        n = n >> 1;
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