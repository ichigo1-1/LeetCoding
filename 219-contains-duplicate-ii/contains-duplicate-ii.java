class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //TLE
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             if(Math.abs(i-j)<=k)
        //             {
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                //the occurence is found now
                //check the index difference
                if(i-hm.get(nums[i])<=k)
                {
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}