class Solution {
    public boolean isvalid(String s)
    {
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                count++;
            }
            else{
                count--;
            }
            if(count<0)
            {
                return false;
            }
        }
        return count==0;
    }
    public void solve(String cur,List<String>res,int len,int n)
    {
        //base case
        if(len==2*n)
        {
            if(isvalid(cur))
            {
                res.add(cur);
            }
            return;
        }
        cur+="(";
        solve(cur,res,len+1,n);
        //remove last added char
        cur=cur.substring(0,cur.length()-1);

        cur+=")";
        solve(cur,res,len+1,n);

    }
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        solve("",res,0,n);
        return res;
    }
}