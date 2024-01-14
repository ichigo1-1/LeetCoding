class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total= (n*(n+1))/2;
        int currrent=0;
        for(int i=0;i<nums.length;i++)
        {
            currrent+=nums[i];
        }
        return total-currrent;

       
     









        
    }
}