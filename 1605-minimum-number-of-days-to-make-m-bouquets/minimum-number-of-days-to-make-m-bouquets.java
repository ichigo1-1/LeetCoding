class Solution {
    public static boolean possible(int[]arr,int day,int r,int b)
    {
        int count=0;
        int bouke=0;
        for(int i=0;i<arr.length;i++)
        {
            if(day>=arr[i])
            {
                count++;
            }
            else{
                bouke+=count/r;
                count=0;
            }

        }
        bouke+=count/r;
        return bouke>=b;
    }
    public int minDays(int[] arr, int b, int r) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            low=Math.min(arr[i],low);
            high=Math.max(arr[i],high);
        }
        int n=arr.length;
        long val=(long)r*b;
        if(val>n)
        {
            return -1;
        }
        int res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(possible(arr,mid,r,b))
            {
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
        
    }
}