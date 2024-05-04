class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            int zeroes=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==0)
                {
                    zeroes++;
                }
                if(zeroes<=k)
                {
                    len=Math.max(len,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return len;
    }
}