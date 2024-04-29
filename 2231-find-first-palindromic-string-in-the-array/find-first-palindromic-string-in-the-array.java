class Solution {
    public static boolean palindrome(String s)
    {
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(palindrome(words[i])==true)
            {
                return words[i];
            }
        }
        return "";
        
    }
}