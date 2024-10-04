class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes=0;
        int ans=0;
        int i=0,j=0;
        int n=nums.length;
        while(j<n)
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

            //calcaulte distance
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}