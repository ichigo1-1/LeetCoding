class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int it:asteroids)
        {
            if(it>0)//+ve
            {
                st.push(it);
            }
            else{
                while(st.size()>0 && st.peek()>0 && st.peek()<-it)
                {
                    st.pop();
                    
                }
                if(st.size()>0 && st.peek()>0 && st.peek()==-it)
                {
                    st.pop();
                }
                else if(st.size()>0 && st.peek()>0 && st.peek()>-it)
                {

                }
                else{
                    st.push(it);
                }

            }
           
           

        }
         int[]res=new int[st.size()];
            for(int i=res.length-1;i>=0;i--)
            {
                res[i]=st.pop();
            }
        return res;
        
        
    }
}