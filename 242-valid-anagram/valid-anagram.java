class Solution {
    public boolean isAnagram(String s, String t) {
        // String a = sortString(s);
        // String b=sortString(t);
        // return a.equals(b);
        
        Map<Character,Integer>hm=new HashMap<>();
        //put all element count
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        //decrease count
        for(char ch:t.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        //last check to check wheter sb 0 hua ki nahi
        for(char ch:hm.keySet())
        {
            if(hm.get(ch)!=0)
            {
                return false;
            }
        }
        return true;
    }
}