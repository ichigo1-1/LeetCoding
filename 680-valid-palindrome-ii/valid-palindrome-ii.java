class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length()-1;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(n-i))
            {
                continue;
            }
            else{
                //2 cases check by skipping both chars one by one
                if(check(s,i,n-1-i) ||  check(s,i+1,n-i))
                {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
     public boolean check(String s, int i, int j)
        {
           while(i<=j)
           {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            else{
                i++;
                j--;
            }
           }
           return true;
        }
}