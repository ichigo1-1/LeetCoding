class Solution {
    public int lowerbound(int []arr,int x)
    {
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]>=x)
        //     {
        //         count++;
        //     }
        // }
        // return count;
       int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public int specialArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int x=0;x<=n;x++)
        {
            int idx=lowerbound(nums,x);
            int counter=n-idx;
            if(counter==x)
            {
                return x;
            }
            
        }
        return -1;
        
    }
}