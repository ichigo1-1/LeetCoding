class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(char ch:word.toCharArray())
        {
            if(ch>='A' && ch<='Z')
            {
                count++;
            }
        }
        if(count==1 && word.charAt(0)>='A' && word.charAt(0)<='Z')
        {
            return true;
        }
        if(count==word.length())
        {
            return true;
        }
        if(count==0)
        {
            return true;
        }
        return false;
        // return word.matches("[A-Z]+") ||     // All capitals
        // word.matches("[a-z]+") ||             // All small letters
        // word.matches("[A-Z]{1}[a-z]+");  // First capital, all small
        


        
    }
}