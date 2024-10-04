class Solution {
    public int maxDepth(String s) {
        int c=0;
        int ans=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                c++;
                ans=Math.max(c,ans);
            }
            else if(ch==')'){
                
                c--;
            }
        }
        return ans;
    }
}