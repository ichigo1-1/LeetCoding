class Solution {
    public boolean isPowerOfTwo(int n) {
      
            // if(n < 1)
            //     return false;
            // while(n%2==0)
            //     n=n/2;

            // return n==1;     


            // if(n==0||n<0)
            //     return false;
            // if((n&(n-1))!=0)
            //     return false;
            // return true;          

            if(n==0 || n<0)
            {
                return false;
            }     
            if((n&(n-1))!=0)
            {
                return false;
            }
            return true;

        
    }
}