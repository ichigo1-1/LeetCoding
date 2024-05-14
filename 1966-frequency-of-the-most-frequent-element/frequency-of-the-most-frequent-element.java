class Solution {
     private int findBest(int targetIdx, int k, int[] nums, long[] prefixSum) {
        int target = nums[targetIdx];
        
        int i = 0;
        int j = targetIdx;
        int result = targetIdx;
        
        while (i <= j) {
            int mid = i + (j - i) / 2;
            
            long count = (targetIdx - mid + 1);
            long windowSum = (count * target);
            long currSum = prefixSum[targetIdx] - prefixSum[mid] + nums[mid];
            
            int ops = (int) (windowSum - currSum);
            
            if (ops > k) {
                i = mid + 1;
            } else {
                result = mid;
                j = mid - 1;
            }
        }
        
        return targetIdx - result + 1;
    }
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        int n=nums.length;
        long[]prefix=new long[n];
        //step 2
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=Math.max(res,findBest(i,k,nums,prefix));
        }
        return res;
        
    }
}