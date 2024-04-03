class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        List<Integer>ls=new ArrayList<>();
        for(int it:nums)
        {
            hm.put(it,hm.getOrDefault(it,0)+1);
        }
        int max=nums.length/3;
        for(int it:hm.keySet())
        {
            if(hm.get(it)>max)
            {
                ls.add(it);
            }
        }
        return ls;
    }
}