class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int it:arr)
        {
            hm.put(it,hm.getOrDefault(it,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int it:hm.values())
        {
            if(set.contains(it))
            {
                return false;
            }
            else{
                set.add(it);
            }
        }
        return true;
        
    }
}