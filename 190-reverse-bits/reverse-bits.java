public class Solution {
    // you need treat n as an unsigned value
    public boolean setbit(int i,int n)
    {
        if(((1<<(i-1)&n))!=0)
        {
            return true;
        }
        return false;
    }
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            if(setbit(i,n))
            {
                ans |=1<<(32-i);
            }
        }
        return ans;
        
    }
}