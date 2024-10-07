class Solution {
    public int minLength(String s) {
        // Stack<Character>st=new Stack<>();
        // st.push(s.charAt(0));
        // for(int i=1;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if (!st.isEmpty() && ((st.peek() == 'A' && ch == 'B') || (st.peek() == 'C' && ch == 'D'))) {
        //         st.pop();
        //     }
        //     else{
        //         st.push(ch);
        //     }
        // }
        // return st.size();


        //2 pointer technique
        int i=0;//write;
        int j=1;//read;
        char[]ch=s.toCharArray();
        int n=s.length();
        while(j<n)
        {
            if(i<0)
            {
                i++;
                ch[i]=ch[j];
            }
            else if((ch[j]=='B' && ch[i]=='A')||(ch[j]=='D' && ch[i]=='C'))
            {
                i--;
            }
            else{
                i++;
                ch[i]=ch[j];
            }
            j++;
        }
        return i+1;
    }
}