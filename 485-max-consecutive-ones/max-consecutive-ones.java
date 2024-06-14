class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        //  int count=0;
        //  int ans=0;
        //  for(int i=0;i<nums.length;i++)
        //  {
        //      if(nums[i]!=1)
        //      {
        //          count=0;
        //      }
        //      else{
        //         count++;
        //         ans=Math.max(ans,count);
        //      }
        //  }
        //  return ans;
        int count=0;
        int max=0;
        for(int it:nums)
        {
            if(it==1)
            {
                count++;
                max=Math.max(max,count);
            }
            else{
                
                count=0;
            }
        }
        return max;
















        

       
    }
}