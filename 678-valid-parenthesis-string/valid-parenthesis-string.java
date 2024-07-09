class Solution {
    public boolean checkValidString(String s) {
        // return rec(s, 0, 0);
        Stack<Integer>open=new Stack<>();
        Stack<Integer>astrix=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open.push(i);
            }
            else if(ch=='*')
            {
                astrix.push(i);
            }
            else{
                if(!open.isEmpty())
                {
                    open.pop();
                }
                else if(!astrix.isEmpty())
                {
                    astrix.pop();
                }
                else{
                    return false;
                }
            }
        }
          // This post processing will be required for cases like - "*(())(*"
          while(!open.isEmpty() && !astrix.isEmpty())
          {
            if(open.peek()>astrix.peek())
            {
                return false;
            }
            open.pop();
            astrix.pop();
          }
          return open.isEmpty();
    }
    // public boolean rec(String s, int i, int c) {
    //     if (c < 0) {
    //         return false;
    //     }//-ve case
    //     if (i == s.length()) {
    //         return c == 0;
    //     }
    //     boolean res = false;
    //     if (s.charAt(i) == '(') {
    //         res = rec(s, i + 1, c + 1);
    //     } else if (s.charAt(i) == ')') {
    //         res = rec(s, i + 1, c - 1);
    //     } else {
    //         res = rec(s, i + 1, c + 1) || rec(s, i + 1, c - 1) || rec(s, i + 1, c);
    //     }
    //     return res;
    // }
}