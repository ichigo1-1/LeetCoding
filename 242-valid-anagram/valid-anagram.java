class Solution {
    public boolean isAnagram(String s, String t) {
        // String a = sortString(s);
        // String b=sortString(t);
        // return a.equals(b);
        if(s.length()!=t.length())
        return false;
        Map<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        //now decrease count
        for(char ch:t.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.getOrDefault(ch,0)-1);
            }
        }
        //now check 
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