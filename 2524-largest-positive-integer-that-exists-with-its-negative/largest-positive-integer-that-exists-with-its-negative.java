class Solution {
    public int findMaxK(int[] nums) {
       
        Arrays.sort(nums);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int it:nums)
        {
            hm.put(it,1);
        }
        for(int it:nums)
        {
            int max=it;
            int neg=-(max);
            if(hm.containsKey(neg))
            {
                return -max;
            }
            
        }
        return -1;
        // for(int it:nums)
        // {

        // }
        
    }
}