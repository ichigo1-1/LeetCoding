class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        //now put
        int cur=0;
        int ans=0;
        for(int []it:boxTypes)
        {
            int weight=it[0];
            
            int units=it[1];
            if(cur+weight<=truckSize)
            {
                cur+=weight;
                ans+=units*weight;
            }
            else{
                int remaining=truckSize-cur;
                ans+=units*remaining;
                break;
            }
        }
        return ans;
    }
}