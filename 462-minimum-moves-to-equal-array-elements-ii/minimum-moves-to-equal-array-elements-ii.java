class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int operations=0;
        for(int it:nums)
        {
            operations+=Math.abs(mid-it);
        }
        return operations;
    }
}