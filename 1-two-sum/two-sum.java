class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  int[] result = new int[2];
    //     HashMap<Integer,Integer>hm = new HashMap<>();
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(hm.containsKey(target-nums[i]))
    //         {
    //             result[1]=i;
    //             result[0]=hm.get(target-nums[i]);
    //         }
    //         else
    //         {
    //             hm.put(nums[i],i);
    //         }
    //     }
    //     return result;

    for(int i=0;i<nums.length;i++)
    {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{};
        
    }
}