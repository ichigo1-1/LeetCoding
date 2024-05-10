class Solution {
    public int minimumLength(String s) {
        //2 POINTERS
        int i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j))
        {
            char ch=s.charAt(i);//can take j also
            //remove max you can for i and do the same with j
            while(i<j && s.charAt(i)==ch)
            {
                i++;
            }
            //very important j>=i ////do it for "aa" then youll now why
            while(j>=i && s.charAt(j)==ch)
            {
                j--;
            }
        }
        return j-i+1;
        
    }
}