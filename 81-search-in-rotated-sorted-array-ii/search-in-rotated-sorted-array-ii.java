class Solution {
    public boolean search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            //for this case [3,1,2,3,4,4,3] low=3,mid=3,hihg=3 so comp cant be done so we just decrease seach space
            if(arr[low]==arr[mid] && arr[mid]==arr[high])
            {
                low=low+1;
                high=high-1;
                continue;
            }
           
            else if(arr[low]<=arr[mid])
            {
                if(arr[low]<=target && target<=arr[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && target<=arr[high])
                {
                    low=mid+1;
                    
                }
                else
                {
                    high=mid-1;
                }
            }
            
        }
        return false;
        
    }
}