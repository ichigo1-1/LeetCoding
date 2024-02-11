public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // int count = 0,mask=1;
        // for(int i=0;i<32;i++)
        // {
        //     if((n&mask)!=0)
        //         count++;
        //         mask<<=1;
        // }
        // return count;

        // int count=0;
        // while(n!=0)
        // {
        //     if((n&1)==1)
        //         count++;

        //     n=n>>>1;    
        // }
        // return count;

          int bitCount = 0;
        while(n != 0){
            bitCount++;
            n &= (n-1);
        }
        return bitCount;
       
        
        
    }
}