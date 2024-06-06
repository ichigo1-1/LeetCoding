class Solution {
    public long countSubarrays(int[] nums, int k) {
        //1. find the max element
        int maxel=Integer.MIN_VALUE;
        int n=nums.length;
        for(int it:nums)
        {   
            maxel=Math.max(maxel,it);
        }
        //2. sliding window
        //to count no of subarrays do n-j
        int i=0;
        int j=0;
        int count=0;
        long result=0;

        while(j<n)
        {
            if(nums[j]==maxel)
            {
                count++;
            }
            while(count>=k)
            {
                //add to result and shrink
                result+=n-j;
                if(nums[i]==maxel)
                {
                    count--;
                }
                i++;
            }
            j++;
        }
        return result;
    }
}