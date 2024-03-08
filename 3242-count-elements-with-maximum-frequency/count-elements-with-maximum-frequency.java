class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int ans=0;
        for(int it:nums)
        {
            hm.put(it,hm.getOrDefault(it,0)+1);
        }
        int count=0;
        for(int i:hm.keySet())
        {
            count=Math.max(hm.get(i),count);
        }
        //now get all with same max count;
        for(int j:hm.keySet())
        {
            if(hm.get(j)==count)
            {
                ans+=hm.get(j);
            }
        }
        return ans;
        
    }
}