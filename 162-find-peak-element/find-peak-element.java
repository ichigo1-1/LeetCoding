class Solution {
    public int findPeakElement(int[] arr) {
        // if(nums.length==1)
        //     return 0;
        // if(nums[0]>nums[1])
        //     return 0;
        // if(nums[nums.length-1]>nums[nums.length-2])
        //     return nums.length-1;

        //  int low=1;
        //  int high=nums.length-2;
        //  while(low<=high)
        //  {
        //     int mid=(low+high)/2;
        //     if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
        //     {
        //         return mid;
        //     }
        //     else if(nums[mid]>nums[mid-1])//incr curve
        //     {
        //         low=mid+1;
        //     }
        //     else if(nums[mid]>nums[mid+1]){
        //         high=mid-1;
        //     }
        //  }   
        // return -1;
        int n = arr.length;

        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;

        int i=1;
        int j=n-2;

        while(i<=j){
            int mid = i+(j-i)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid-1]) j = mid-1;
            else if(arr[mid]<arr[mid+1]) i = mid+1;
        }

        return -1;
        
    }
}