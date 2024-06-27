class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        //run loop from backwards so that to avoid the thery of sum of 2 sides> 3rd side
        //if we dont sort then weve to perfrom all checks
        //s1+s2>s3
        //s2+s3>s1
        //s3+s1>s2
        // if we sort and start from backwards and only chcek wheter i-1+i-2>i then we dont need to perform other checks as sum of 2 smallest is greater than the largest so sum of largest and smallest will alwauys be greater
        int ans=0;
        for(int i=nums.length-1;i>=2;i--)
        {
            if(nums[i-1]+nums[i-2]>nums[i])
            {
                ans=nums[i]+nums[i-1]+nums[i-2];
                return ans;
            }
        }
        return ans;
    }
}