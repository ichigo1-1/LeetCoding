class Solution {
    public boolean canJump(int[] nums) {
        
        int maxind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxind)
            {
                return false;
            }
            maxind=Math.max(maxind,i+nums[i]);
        }
        return true;
    }
}