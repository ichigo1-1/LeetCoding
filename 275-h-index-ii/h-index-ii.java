class Solution {
    public int hIndex(int[] citations) {
        int low=0;
        int high=citations.length-1;
        int n=citations.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(n-mid+1<=citations[mid])
            {
                ans=n-mid+1;
                //as right wala sorted hi hai
                //we want to look up for elements with more h index kam value but more qualtity so well look on left;
                high=mid-1;
            }
            else{
               
                low=mid+1;
            }
        }
        return ans;
        
    }
}