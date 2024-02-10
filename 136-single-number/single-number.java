class Solution {
    public int singleNumber(int[] nums) {
        //set
        //hashmap
        //xor method
        int ansxor=0;
        for(int it:nums)
        {
            ansxor^=it;
        }
        return ansxor;
        
    }
}