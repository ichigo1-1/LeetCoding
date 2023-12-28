class Solution {
    public int maxDepth(String s) {
        int count=0;
        int result=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                count++;
                result=Math.max(count,result);
            }
            else if(c==')'){
                count--;
            }
        }
        return result;
        
    }
}