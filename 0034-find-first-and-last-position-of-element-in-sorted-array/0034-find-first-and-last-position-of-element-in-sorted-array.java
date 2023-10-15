class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] result=new int[2];
        result[0]=searchone(nums,target);
        result[1]=searchtwo(nums,target);
        
        return result;
    }
    private int searchone(int []nums,int target)
    {
        //LEFT SEARCH
        int start=0;
        int end=nums.length -1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return index;
    }


        private int searchtwo(int []nums,int target)
    {
            //RIGHT SEARCH
        int start=0;
        int end=nums.length -1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                index=mid;
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return index;
    }
}

// brute force
   //First occurence
//         int res[]=new int [2];
//         res[0]=-1;
//         res[1]=-1;
//         // if(nums.length==1)
//         // {
//         //     res[0]=0;
//         //     res[1]=0;
//         //     return res;
//         // }
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]==target)
//             {
//                 res[0]=i;
//                 break;
//             }
//         }
//         for(int j=nums.length-1;j>=0;j--)
//         {
//             if(nums[j]==target)
//             {
//                 res[1]=j;
//                 break;
//             }
//         }
      
//         return res;
        
        
//     }
// }

