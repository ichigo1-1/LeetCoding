class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        //org:-abcd
        //rev:-dcba
        for(int i=0;i<s.length();i++)
        {
            if(s.substring(0,s.length()-i).equals(rev.substring(i)))
            {
                return rev.substring(0,i)+s;
            }
        }
        //the whole string is the culprit
        //append the reverse in the org string to form the palindrome
        return rev+s;
    }
}