class Solution {
    public int[] productExceptSelf(int[] nums) {

        //          APPROACH 1(TLE)
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

        //           APPROACH 2(USING THE /)
        // int[]res=new int[nums.length];
        // int ind=0;
        // int zeroes=0;
        // int product=1;
        // int prod_without_zeroes=1;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==0)
        //     {
        //         zeroes++;
        //     }
        //     if(nums[i]!=0)
        //     {
        //         prod_without_zeroes*=nums[i];
        //     }
        //     product*=nums[i];
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=0)
        //     {
        //         if(zeroes>0)
        //         {
        //             res[ind++]=0;
        //         }
        //         else{
        //             res[ind++]=product/nums[i];
        //         }
        //     }
        //     else{
        //         if(zeroes>1)
        //         {
        //             res[ind++]=0;
        //         }
        //         else{
        //             res[ind++]=prod_without_zeroes;
        //         }
        //     }
        // }
        // return res;

        //                  APPROACH 3:- USING PREFIX AND SUFFIX
        int[]prefix=new int[nums.length];
        int[]suffix=new int[nums.length];
        prefix[0]=1;
        suffix[suffix.length-1]=1;
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int i=suffix.length-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        //now fill the resultant array
        int[]res=new int[nums.length];
        int ind=0;

        for(int i=0;i<nums.length;i++)
        {
            res[ind++]=prefix[i]*suffix[i];
        }
        return res;
    }
}