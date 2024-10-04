class Solution {
    public int minBitFlips(int start, int goal) {
        int xored=start^goal;
        //count ones
        int count=0;
        for(int i=0;i<32;i++)
        {
            if(((xored&(1<<i))!=0))
            {
                count++;
            }
        }
        return count;
    }
}