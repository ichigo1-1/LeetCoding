class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        // if(n==1)
        //     return 0;
        // if(nums[0]>=nums[1])
        //     return 0;
        // if(nums[n-1]>=nums[n-2])
        //     return n-1;
        // for(int i=1;i<n-1;i++)
        // {
        //     if(nums[i]>=nums[i+1] && nums[i]>=nums[i-1])
        //     {
        //         return i;
        //     }
        // }
        // return 0;
        
        // Binary search
        
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            //think of the mountain example
            
            if(nums[mid]>=nums[mid+1])
                right=mid;
            else
                left=mid+1;
            
        }
        return left;
        
    }
}