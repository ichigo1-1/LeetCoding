class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int min=-1;
        int max=-1;
        int culpritindex=-1;
        int i=0;
        long ans=0;
        while(i<nums.length)
        {
            //3 conditions
            if(nums[i]==minK)
            {
                min=i;
            }
            if(nums[i]==maxK)
            {
                max=i;
            }  
            if(nums[i]>maxK || nums[i]<minK)
            {
                culpritindex=i;
            }
            //smallest find karo between min and max 
            //this ensure ki wo to include hona hi hai
            int smallest=Math.min(min,max);
            long temp=smallest-culpritindex;
            //if ans comes out to be -ve than no subarrays are found if +ve then found
             ans+= temp<=0?0:temp;
             i++;
        }
        return ans;

        
    }
}