class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int []ans=new int[n];
        
        // Create separate arrays for positive and negative numbers
        int[] positiveArray = new int[n];
        int[] negativeArray = new int[n];
        int posCount = 0;
        int negCount = 1;
        
      for(int i=0;i<n;i++)
      {
          if(nums[i]<0)
          {
              ans[negCount]=nums[i];
              negCount+=2;
          }
          else
          {
              ans[posCount]=nums[i];
              posCount+=2;
          }
    }
        return ans;
        
    }
   
}