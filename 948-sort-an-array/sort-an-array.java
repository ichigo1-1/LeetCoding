class Solution {
    public int[] sortArray(int[] nums) {
        //USING COUNTING SORT
        int[]res=new int[nums.length];
        int max=-1;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int min=0;
        for(int it:nums)
        {
            if(it>max)
            {
                max=it;
            }
            if(it<min)
            {
                min=it;
            }
            hm.put(it,hm.getOrDefault(it,0)+1);
        }
        //now traverse the range
        int index=0;
        for(int i=min;i<=max;i++)
        {
            while(hm.getOrDefault(i,0)>0)
            {
                res[index++]=i;
                hm.put(i,hm.get(i)-1);
            }
        }
        return res;
    }
}