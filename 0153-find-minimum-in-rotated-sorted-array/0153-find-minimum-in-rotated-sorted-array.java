class Solution {
    public int findMin(int[]arr) {
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            //left part is sorted ? find the min and elimate right half
            if(arr[low]<=arr[mid])
            {
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            //right half is sorted ? find the min and elimate right half
            else
            {
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
        
    }
}