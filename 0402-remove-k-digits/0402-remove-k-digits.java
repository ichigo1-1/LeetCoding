class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>s=new Stack<>();
        int n=num.length();
        if(k==n)
                return "0";
        if(k==0)
                return num;
        int index=0;        
        while(index<n)
        {
            
            while(!s.isEmpty() && k>0 && s.peek()>num.charAt(index))
            {
                s.pop();
                k--;
            }
            s.push(num.charAt(index++));
            
        }
        while(k-->0)
        {
            s.pop();
            
        }
        //Storing the result
        String small="";
        while(!s.isEmpty())
        {
            small=s.pop()+small;
        }
        String regex = "^0+(?!$)";
 
        // Replaces the matched
        // value with given string
        small = small.replaceAll(regex, "");
 
        
       return small;
        
    }
}

