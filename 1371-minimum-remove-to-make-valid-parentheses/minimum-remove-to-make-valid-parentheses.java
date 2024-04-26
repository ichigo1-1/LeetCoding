class Solution {
    public String minRemoveToMakeValid(String s) {

        //algo
        //1.well chcek only ( and )
        //2.well push indexes and according to them well mark the unvalids as .
        //3. well do all this modifcations in an array


        char []arr=s.toCharArray();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            //pushing indexes
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(i);
            }
            else if(ch==')'){
                //agar directly we encount a ")" its invalid
                if(st.isEmpty())
                {
                    arr[i]='.';
                }
                else{
                    st.pop();
                }
            }
        }
        //the left ones in stack are invalid as no pairs are there for them
        while(st.size()>0)
        {
            arr[st.pop()]='.';
        }
        StringBuilder sb=new StringBuilder();
        for(char c:arr)
        {
            if(c!='.')
            {
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}