class Solution {
    public int maxSubArray(int[] nums) {
        //KADENS ALGORITHM
//         if(nums.length==0)
//             return 0;
//         int cur = 0;
//         int maxtillnow = nums[0];
//         for(int i=0;i<nums.length;i++)
//         {
//             cur = cur + nums[i];
//             if(cur>maxtillnow)
//             {
//                 maxtillnow = cur;
//             }
//             if(cur<=0)
//             {
//                 cur = 0;
//             }
//         }
//         return maxtillnow
        if(nums.length==0)
            return 0;
        int current=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            current=Math.max(nums[i],current+nums[i]);
           maxSum=Math.max(maxSum,current);
        }
        return maxSum;
    }
// }
}

