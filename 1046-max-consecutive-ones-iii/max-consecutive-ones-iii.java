class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes=0;
        int i=0,j=0;
        int len=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                zeroes++;
            }
            while(zeroes>k)
            {
                if(nums[i]==0)
                {
                    zeroes--;
                }
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}