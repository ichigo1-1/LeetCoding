class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer>st=new Stack<>();
        //we are repre. ( with -1 as not possible to store both char and int in stack
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(-1);
            }
            else{
                //agar shuruwat me hi milgia ( then acc to rule 1 score should be 1
                if(st.peek()==-1)
                {
                    st.pop();
                    st.push(1);
                }
                else{
                    //rule 2 and 3
                    int val=0;
                    while(st.peek()!=-1)
                    {
                        //keep adding values and multiply by 2 later
                        val+=st.pop();
                    }
                    st.pop();
                    st.push(2*val);
                }
            }
        }
        //special case if there are only ()()-> score->2 
        //so you need to repeat the while case once again until size =0
         int val=0;
                    while(st.size()>0)
                    {
                        //keep adding values and multiply by 2 later
                        val+=st.pop();
                    }
                    return val;
                    
    
        
    }
}