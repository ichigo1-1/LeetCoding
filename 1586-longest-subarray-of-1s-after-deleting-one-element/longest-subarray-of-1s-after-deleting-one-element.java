class Solution {
    // public int findmax(int[]arr,int skip)
    // {
    // //     int maxlen=0;
    //     int curlen=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(i==skip)
    //         {
    //             continue;
    //         }
    //         if(arr[i]==1)
    //         {
    //             curlen++;
    //             maxlen=Math.max(maxlen,curlen);
    //         }
    //         else{
    //             curlen=0;
    //         }

    //     }
    //     return maxlen;
    // }
    public int longestSubarray(int[] nums) {
    //     int n=nums.length;
    //     int result=-1;
    //     int countzeroes=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(nums[i]==0)
    //         {
    //             countzeroes++;
    //             result=Math.max(result,findmax(nums,i));
    //         }
    //     }
    //     if(countzeroes==0)
    //     {
    //         return n-1;
    //     }
    //     return result;
    int i=0;
    int j=0;
    int n=nums.length;
    int len=0;
    int countzeroes=0;
    while(j<n)
    {
        if(nums[j]==0)
        {
            countzeroes++;
        }
        if(countzeroes>1)
        {
            //shrink
            if(nums[i]==0)
            {
                countzeroes--;
            }
            i++;
        }
        len=Math.max(len,j-i+1);
        j++;

    }
return len-1;
    }

}