//or you can try the lower bound and upperbound
class Solution {
    public static int upperBound(int []arr, int n, int x){
        // Write your code here.
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                ans=mid;
                high=mid-1;
            }
            //since mid cant be our ans so we need to search on right side
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
       //smallest number arr[index]>=x
       //ya to wo number ya to usse ek thora bara wala jiska index sabse chota ho
       int ans=n;
       int low=0;
       int high=n-1;
       while(low<=high)
       {
           int mid=low+(high-low)/2;
           if(arr[mid]>=x)
           {
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       return ans;
    }
    public int[] searchRange(int[] nums, int target) {

        int [] res=new int[2];
        int n=nums.length;
        int lb=lowerBound(nums,n,target);
        if(lb == n || nums[lb]!=target)
        {
            return new int[] {-1,-1};
        }
        res[0]=lb;
        int ub=upperBound(nums,n,target);
        res[1]=ub-1;
        // result[0]=searchone(nums,target);
        // result[1]=searchtwo(nums,target);
        
        return res;
    }
    
    // private int searchone(int []nums,int target)
    // {
    //     //LEFT SEARCH
    //     int start=0;
    //     int end=nums.length -1;
    //     int index=-1;
    //     while(start<=end)
    //     {
    //         int mid=start+(end-start)/2;
    //         if(nums[mid]==target)
    //         {
    //             index=mid;
    //             end=mid-1;
    //         }
    //         else if(nums[mid]>target)
    //         {
    //             end=mid-1;
    //         }
    //         else
    //         {
    //             start=mid+1;
    //         }
    //     }
    //     return index;
    // }


    //     private int searchtwo(int []nums,int target)
    // {
    //         //RIGHT SEARCH
    //     int start=0;
    //     int end=nums.length -1;
    //     int index=-1;
    //     while(start<=end)
    //     {
    //         int mid=start+(end-start)/2;
    //         if(nums[mid]==target)
    //         {
    //             index=mid;
    //             start=mid+1;
    //         }
    //         else if(nums[mid]>target)
    //         {
    //             end=mid-1;
    //         }
    //         else
    //         {
    //             start=mid+1;
    //         }
    //     }
    //     return index;
    // }
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

