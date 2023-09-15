class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int ans=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
                
            }
            else
            {
                hm.put(nums[i],1);
            }
            
        }
        for(int i:hm.keySet())
        {
            if(hm.get(i)==1)
               {
                   ans=i;
               }
        }
               return ans;
        
    }
}