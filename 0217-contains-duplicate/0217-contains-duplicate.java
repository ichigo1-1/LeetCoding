class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         return true;
        //     }
        //     else
        //     {
        //         map.put(nums[i],i);
        //     }
        // }
        // return false;
         HashSet<Integer> hs  =  new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]); 
        }
        if(nums.length==hs.size())
            return false;
        return true;    
        
        

        
        
    }
}