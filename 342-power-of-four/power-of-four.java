class Solution {
    public boolean isPowerOfFour(int n) {
        // if(n==0)
        // {
        //     return false;
        // }
        // while(n%4==0)
        // {
        //     n=n/4;
        // }
        // return n==1;
        
        //using recursion
        if(n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%4!=0)
        {
            return false;
        }
        return isPowerOfFour(n/4);
        
    }
}