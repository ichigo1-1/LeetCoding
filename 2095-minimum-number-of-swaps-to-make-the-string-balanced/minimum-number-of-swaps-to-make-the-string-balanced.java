class Solution {
    public int minSwaps(String s) {
        //observation based
        //note:- if somehow well remove all the balanced parenthesis then well see a pattern where one side is full closed brackets and other side has open 
        //ex:-][][
            //removing balanced[] ---->][
                //now min swaps needed = count_of_open_brackets+1/2;

        //ex:-"]]][[["  opencount=3 //ans=3+1/2 -->2 swaps needed
        //in one swap 2 brackets are balanced
        Stack<Character>st=new Stack<>();
        int count_open=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='['){
                count_open++;
            }
            if(!st.isEmpty() && st.peek()=='[' && ch==']')
            {
                st.pop();
                count_open--;
            }
            else{
                st.push(ch);
            }
            
        }      
        if(count_open==0)
        {
            return 0;
        }
        int ans=(count_open+1)/2;
        return ans;
    }
}