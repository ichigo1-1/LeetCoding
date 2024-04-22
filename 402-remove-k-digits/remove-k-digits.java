import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character>st=new Stack<>();
        //if next if smaller than the peek
        //remove 
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            while(!st.isEmpty() && k > 0 && st.peek() > ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        
        // Remove remaining digits from the end if k is still greater than 0
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        
        // Construct the result string using StringBuilder
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        
        // Reverse the string to get the correct order
        sb.reverse();
        
        // Remove leading zeros
        int d=0;
        int n=sb.length();
        while(d < sb.length() && sb.charAt(d)=='0')
        {
            d++;
        }
        
        // If resulting number is empty, return "0"
        if (d == sb.length()) {
            return "0";
        }
        
        return sb.substring(d,n);
    }
}
