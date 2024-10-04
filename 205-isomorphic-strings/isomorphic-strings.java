class Solution {
    public boolean isIsomorphic(String s, String t) {
        int a=s.length();
        int b=t.length();
        if(a!=b)
        {
            return false;
        }

        HashMap<Character,Character>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                if(!hm.get(ch).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else{
                //This checks whether the current character from string t (t.charAt(i)) has already been assigned to another character in string s.
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