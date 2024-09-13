class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        {
            return false;
        }
        boolean vow=false;
        boolean cons=false;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isLetter(ch))
            {
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    vow=true;
                }
                else{
                    cons=true;
                }
            }
            else if(Character.isDigit(ch))
            {
                continue;
            }
            else{
                return false;
            }
            
        }
        if(vow==true && cons==true)
            {
                return true;
            }
        return false;
    }
}