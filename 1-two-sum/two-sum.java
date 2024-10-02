class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
    
        int []res=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int rem=target-nums[i];
            if(hm.containsKey(rem))
            {
                res[0]=i;
                res[1]=hm.get(rem);
                return res;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}