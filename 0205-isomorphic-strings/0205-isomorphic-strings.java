class Solution {
    public boolean isIsomorphic(String s, String t) {
        int a=s.length();
        int b=t.length();

        if(a!=b)
            return false;
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i=0;i<a;i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                if(!hm.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                if(hm.containsValue(t.charAt(i)))
                {
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));

            }

        }  
        return true;  
        
    }
}