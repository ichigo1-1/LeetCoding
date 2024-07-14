class Solution {
    public String countOfAtoms(String formula) {
        int n=formula.length();
        //Using a stack because this kind of deals with parenthesis 
        Stack<Map<String,Integer>>st=new Stack<>();
        st.push(new HashMap<>());
        //Traversing
        int i=0;
        while(i<n)
        {
            //if (
            if(formula.charAt(i)=='(')
            {
                //it means a new element
                st.push(new HashMap<>());
                i++;
            }
            else if(formula.charAt(i)==')')
            {
                //get the top most element for preprocessing
                //pop it as we ve to merege it now to the top again
                Map<String,Integer>top=st.pop();
                //to get the count (Integer)
                i++;
                StringBuilder sb=new StringBuilder();
                while(i<n && Character.isDigit(formula.charAt(i)))
                {
                    sb.append(formula.charAt(i));
                    i++;
                }
                //now you got the number in string format\
                //convert it to integer for multiplication\
                int multiplier=sb.length()>0?Integer.parseInt(sb.toString()):1;

                for(String key:top.keySet())
                {
                    int value=top.get(key);
                    top.put(key,value*multiplier);
                }
                //now push it to the top and merge if element already present
                for(String key:top.keySet())
                {
                    st.peek().put(key,st.peek().getOrDefault(key,0)+top.get(key));
                }
            }
            else{
                StringBuilder element=new StringBuilder();
                element.append(formula.charAt(i++));
                while(i<n && Character.isLowerCase(formula.charAt(i)))
                {
                    element.append(formula.charAt(i++));
                }
                StringBuilder counts=new StringBuilder();
                while(i<n && Character.isDigit(formula.charAt(i)))
                {
                    counts.append(formula.charAt(i++));
                }
                int count=counts.length()>0?Integer.parseInt(counts.toString()):1;
                st.peek().put(element.toString(),st.peek().getOrDefault(element.toString(),0)+count);
            }
        }
        //To store result in sorted fashion we ll be using treemap as it holds in sorted fashion
        TreeMap<String,Integer>tm=new TreeMap<>(st.peek());
        StringBuilder result=new StringBuilder();
        for(String key:tm.keySet())
        {
            result.append(key);
            int count=tm.get(key);
            if(count>1)
            {
                result.append(count);
            }
        }
        return result.toString();
    }
}