class Solution {
    public int minLength(String s) {
        Stack<Character>st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (!st.isEmpty() && ((st.peek() == 'A' && ch == 'B') || (st.peek() == 'C' && ch == 'D'))) {
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
    }
}