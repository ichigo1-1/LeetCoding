class Solution {
    public int possible(int[]nums,int div,int threshold)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil((double)nums[i]/(double)div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            high=Math.max(high,nums[i]);
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(possible(nums,mid,threshold)<=threshold)
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