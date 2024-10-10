class Solution {
    public int maxWidthRamp(int[] nums) {
        // int ans = 0; 
        // int cur=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]<=nums[j])
        //         {
        //             cur=j-i;
        //         }
        //         if(cur>ans)
        //         {
        //             ans=cur;
        //         }
        //     }
        // }
        // Stack<Integer>st=new Stack<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(!st.isEmpty() && nums[st.peek()]>nums[i])
        //     {
        //         st.pop();
        //     }
        //     if(!st.isEmpty())
        //     {
        //         ans=i-st.peek();
        //     }
        //     st.push(i);
        // }
        // return ans;
        // int n = nums.length;

        // // Create an array to store the maximum values from the right
        // int[] maxRight = new int[n];
        // maxRight[n - 1] = nums[n - 1];
        
        // // Fill the maxRight array
        // for (int i = n - 2; i >= 0; i--) {
        //     maxRight[i] = Math.max(maxRight[i + 1], nums[i]);
        // }
        // int ramp = 0;
        // int i = 0;
        // int j = 0;

        // // Find the maximum width ramp
        // while (j < n) {
        //     while (i < j && nums[i] > maxRight[j]) {
        //         i++;
        //     }
        //     ramp = Math.max(ramp, j - i);
        //     j++;
        // }

        // return ramp;
        int n=nums.length;
        int[]res=new int[n];
        res[n-1]=nums[n-1];
        
        for(int i=n-2;i>=0;i--)
        {
            res[i]=Math.max(res[i+1],nums[i]);
        }
        int ramp = 0;
        int i = 0;
        int j = 0;
        while(j<n)
        {
            while(i<j && nums[i]>res[j])
            {
                i++;
            }
            ramp=Math.max(ramp,j-i);
            j++;
        }
        return ramp;
    }
}