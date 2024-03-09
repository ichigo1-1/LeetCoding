class Solution {
    public int singleNumber(int[] nums) {
        // int ans=0;
        // for(int i=0;i<32;i++)
        // {
        //     int sum=0;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         //to check if bit is one we do
        //         if(((nums[j]>>i)&1)==1)
        //         {
        //             sum++;
        //         }
        //     }
        //     sum%=3;
        //     if(sum!=0)
        //     {
        //         ans|=sum<<i;
        //     }

        // }
        // return ans;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int j:hm.keySet())
        {
            if(hm.get(j)!=3)
            {
                return j;
            }
        }
        return -1;
        
    }
}