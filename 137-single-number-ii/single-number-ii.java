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

        // HashMap<Integer,Integer>hm=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }
        // for(int j:hm.keySet())
        // {
        //     if(hm.get(j)!=3)
        //     {
        //         return j;
        //     }
        // }
        // return -1;

        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i=i+3)
        // {
        //     if(nums[i]!=nums[i-1])
        //     {
        //         return nums[i-1];
        //     }
        // }
        // return nums[nums.length-1];
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int numbers=0;numbers<nums.length;numbers++)
            {
                //count karo set bits ka
                if((nums[numbers]&(1<<i))!=0)
                {
                    count++;
                }
            }
            if(count%3==1)
            {
                ans=ans | (1<<i);
            }

        }
        return ans;
    }
}