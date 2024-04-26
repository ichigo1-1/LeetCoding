class Solution {
    public String removeDuplicateLetters(String s) {
    
    //algo
    //1.count--
    //2.exist
    //3.check big or not  -if true remove and mark false;
    //4.push and make false
    Stack<Character>st=new Stack<>();
    boolean []exists=new boolean[26];
    int[]freq=new int[26];

    //filling frequencies
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        freq[ch-'a']++;
    }
    
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        //step 1
        freq[ch-'a']--;
        
        //step 2
        if(exists[ch-'a']==true)
        {
            continue;
        }
        //step 3
        while(st.size()>0 && st.peek()>ch && freq[st.peek()-'a']>0)
        {
            char remove=st.pop();
            exists[remove-'a']=false;
        }
        //step 4:
        //push and mark true;
        st.push(ch);
        exists[ch-'a']=true;
    }

    //put all stack elements to string
    StringBuilder sb=new StringBuilder();
    while(st.size()>0)
    {
        sb.append(st.pop());
    }
    sb.reverse();
    return sb.toString();
        
    }
}