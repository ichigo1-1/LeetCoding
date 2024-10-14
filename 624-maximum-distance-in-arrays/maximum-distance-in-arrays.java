class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        //to max diff max-min always
        //1stly store the max and min of first list
        //start from 2nd
        //get its max and min
        //calculate max-min and min-max   for both check whose diff is greater store it
        //before going update max and min if better candidates are found

        int mini=arrays.get(0).get(0);
        int maxi=arrays.get(0).get(arrays.get(0).size()-1);

        int res=0;
        for(int i=1;i<arrays.size();i++)
        {
            int curmin=arrays.get(i).get(0);
            int curmax=arrays.get(i).get(arrays.get(i).size()-1);

            //calculate diff
            res=Math.max(res,Math.max(Math.abs(curmax-mini),Math.abs(curmin-maxi)));
            //update max and min
            if(curmin<mini)
            {
                mini=curmin;
            }
            if(curmax>maxi)
            {
                maxi=curmax;
            }
        }
        return res;
    }
}