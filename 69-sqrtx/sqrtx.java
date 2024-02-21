class Solution {
    public int mySqrt(int x) {
        long y=(long)x;
        long low=1;
        long high=y;
        long ans=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            long val=mid*mid;
            if(val<=y)
            {
                ans=mid;
                 low=mid+1;
            }
            else{
                
               
                high=mid-1;
            }
        }
        return (int)ans;
        
    }
}




