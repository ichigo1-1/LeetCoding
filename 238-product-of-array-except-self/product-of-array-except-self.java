class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[]res=new int[nums.length];
        // int ind=0;
        
        // for(int i=0;i<nums.length;i++)
        // {
        //     int product=1;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(i!=j)
        //         {
        //             product*=nums[j];
        //         }
        //     }
        //     res[ind++]=product;
        // }
        // return res;

        //           APPROACH 2
        int[]res=new int[nums.length];
        int ind=0;
        int zeroes=0;
        int product=1;
        int prod_without_zeroes=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeroes++;
            }
            if(nums[i]!=0)
            {
                prod_without_zeroes*=nums[i];
            }
            product*=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                if(zeroes>0)
                {
                    res[ind++]=0;
                }
                else{
                    res[ind++]=product/nums[i];
                }
            }
            else{
                if(zeroes>1)
                {
                    res[ind++]=0;
                }
                else{
                    res[ind++]=prod_without_zeroes;
                }
            }
        }
        return res;
    }
}