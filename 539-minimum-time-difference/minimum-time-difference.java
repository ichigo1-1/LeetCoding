class Solution {
    public int findMinDifference(List<String> timePoints) {
        //convert everything into minutes by taking 00:00 as reference
        //doing this bec if not xomparing values would ve been hard
        int[]min=new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++)
        {
            String current=timePoints.get(i);
            int hour=Integer.parseInt(current.substring(0,2));
            int minutes=Integer.parseInt(current.substring(3,5));
            min[i]=hour*60+minutes;
        }
        //now sort to get the min value
        //min values could be fetched by comapring adjacent values
        Arrays.sort(min);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<min.length;i++)
        {
            ans=Math.min(ans,Math.abs(min[i]-min[i-1]));
        }
        //also check the diff between first and last
        int n=min.length;
        ans=Math.min(ans,1440-min[n-1]+min[0]);
        return ans;
    }
}