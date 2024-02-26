class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int num=1;
        for(int i=0;i<pattern.length();i++)
        {
            //agar d hai toh push kardo and increase
            //but asap i comes we do the same thing but pop until st is empty.
            char ch=pattern.charAt(i);
            if(ch=='D')
            {
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;
                //empty stack until size=0
                while(!st.isEmpty())
                {
                    sb.append(st.pop());

                }

            }
        }
        //we push the last element and pop until stack is empty
        st.push(num);
        while(!st.isEmpty())
                {
                    sb.append(st.pop());

                }
        return sb.toString();        
        
    }
}

