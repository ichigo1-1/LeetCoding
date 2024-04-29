class Solution {
    public int minOperations(int[] nums, int k) {

        //algo
        //1.find the xor of all nums
        //2. xor with k
        //3. number of 1s is the minimum number of bit flips
        int xor=0;
        for(int ele:nums)
        {
            xor^=ele;
        }
        //step 2:
        int res=xor^k;
        //step 3:count ones
        int count=0;
      
        while (res > 0) {
            count += res & 1; // Adds 1 if the least significant bit is 1
            res >>= 1; // Right shift num by 1 bit
    }
    return count;
        
    }
}