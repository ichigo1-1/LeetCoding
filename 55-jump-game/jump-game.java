class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max)//the maximum you were able to reach was 4 but now youre currently at 5 which is actually not possible hence return false
            {
                return false;
            }
            max=Math.max(max,nums[i]+i);
        }
        return true;
    }
}