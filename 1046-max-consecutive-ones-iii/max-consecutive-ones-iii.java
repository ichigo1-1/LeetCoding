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

        //O(2 N)  SLIDING WINDOW
        // int l=0;
        // int r=0;
        // int max=0;
        // int zeroes=0;
        // while(r<nums.length)
        // {
        //     if(nums[r]==0)
        //     {
        //         zeroes++;
        //     }
        //     //if greater than shrink until the window is perfect and fitting the cond.
        //     //changing this while to if will bring the solutioon to o(n) as were not allowing if cur len==max len then no need to move further just move by ne step
            
        //     //WHILE
        //     if(zeroes>k)
        //     {
        //         if(nums[l]==0)
        //         {
        //             zeroes--;
        //         }
        //         l++;
        //     }
        //     //if while is executed it will be now on a window satisfying cond. so keep counting len
        //     if(zeroes<=k)
        //     {
        //         int len=r-l+1;
        //         max=Math.max(len,max);
        //     }
          
        //     //always increase r
        //     r++;
        // }
        // return max;
        int i=0;
        int j=0;
        int n=nums.length;
        int max=0;
        int count=0;
        while(j<n)
        {
            if(count>k)
            {
                //shrink
                if(nums[i]==0)
                {
                    count--;
                }
                i++;
            }
            if(nums[j]==0)
            {
                count++;
            }
            if(count<=k)
            {
                max=Math.max(max,j-i+1);
            
            }
            j++;
        }
        return max;
    }
}