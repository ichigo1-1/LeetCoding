class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int len = Integer.MAX_VALUE; // Initialize len to a large value
        int i = 0;
        int sum = 0;
        int j=0;
        int n = nums.length;

        // for (int j = 0; j < n; j++) {
        //     sum += nums[j];
            
        //     while (sum >= target) {
        //         len = Math.min(len, j - i + 1);
        //         sum -= nums[i];
        //         i++;
        //     }
        // }
        while(j<n)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                len=Math.min(len,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }

        // If len was never updated, return 0 (indicating no valid subarray found)
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}