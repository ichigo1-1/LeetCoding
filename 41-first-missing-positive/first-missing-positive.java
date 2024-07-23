class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=0;
        HashSet<Integer>hm=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.add(nums[i]);
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        //now search 
        for(int i=1;i<=max;i++)
        {
            if(!hm.contains(i))
            {
                return i;
            }
        }
        return max+1;

        
        
    }
}