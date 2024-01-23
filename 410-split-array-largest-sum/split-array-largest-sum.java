class Solution {
    public int possible(int[] nums,int num,int k)
    {
        int labour=1;
        int cur=0;
        for(int i=0;i<nums.length;i++)
        {
            if(cur+nums[i]<=num)
            {
                cur+=nums[i];
            }
            else{
                labour++;
                cur=nums[i];
            }
        }
        return labour;
    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<nums.length;i++)
        {
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(possible(nums,mid,k)<=k)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}