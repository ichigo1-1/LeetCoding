class Solution {

    //*********brute force******** time limit exceed
    public int max(int[]piles)
    {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>maxi)
            {
                maxi=piles[i];
            }
        }
        return maxi;
    }

    public int calculate (int []piles,int hourly)
    {
        int hours=0;
        for(int i=0;i<piles.length;i++)
        {
            hours+=Math.ceil((double)piles[i]/(double)hourly);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {

     int ans=binary_search(piles,h);
     return ans;
    }
    public int binary_search(int[]piles,int h)
    {
        int high=max(piles);
        int low=1;
        while(low<=high)
        {
            
            int mid=low+(high-low)/2;
            int total_hours=calculate(piles,mid);
            if(total_hours<=h)
            {
                
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
  
}