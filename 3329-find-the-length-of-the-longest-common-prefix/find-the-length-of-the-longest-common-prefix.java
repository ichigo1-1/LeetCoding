class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer>hm=new HashSet<>();
        for(int it:arr1)
        {
            while(!hm.contains(it) && it>0)
            {
                hm.add(it);
                it=it/10;
            }
        }
        //now loop through 2nd to check 
        int res=0;
        for(int it:arr2)
        {
            while(!hm.contains(it)&& it>0)
            {
                it/=10;
            }
            res=Math.max(res,(int)Math.log10(it)+1);
        }
        return res;
    }
}