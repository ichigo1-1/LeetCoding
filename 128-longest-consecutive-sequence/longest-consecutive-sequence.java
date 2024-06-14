class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean>hm=new HashMap<>();
        for(int val:nums)
        {
            hm.put(val,true);
        }
        for(int val:nums)
        {
            if(hm.containsKey(val-1))
            {
                //if exist then it is not the starting index
                hm.put(val,false);
            }
        }
   
        int max=0;

        for(int val:nums)
        {
            if(hm.get(val)==true)
            {
                int temp=1;
                while(hm.containsKey(val+temp))
                {
                    temp++;
                }
                if(temp>max)
                {
                    max=temp;
                }
            }
        }
        return max;

        
    }
}




