class Solution {
    public int longestOnes(int[] nums, int k) {
        //BRUTE  (N2)
        // int len=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int zeroes=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]==0)
        //         {
        //             zeroes++;
        //         }
        //         if(zeroes<=k)
        //         {
        //             len=Math.max(len,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return len;

        //O(N)  SLIDING WINDOW
        int l=0;
        int r=0;
        int max=0;
        int zeroes=0;
        while(r<nums.length)
        {
            if(nums[r]==0)
            {
                zeroes++;
            }
            //if greater than shrink until the window is perfect and fitting the cond.
            while(zeroes>k)
            {
                if(nums[l]==0)
                {
                    zeroes--;
                }
                l++;
            }
            //if while is executed it will be now on a window satisfying cond. so keep counting len
            if(zeroes<=k)
            {
                int len=r-l+1;
                max=Math.max(len,max);
            }
          
            //always increase r
            r++;
        }
        return max;
    }
}