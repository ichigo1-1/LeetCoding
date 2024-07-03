class Pair
{
    String words;
    int steps;
    Pair(String w,int s)
    {
        words=w;
        steps=s;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String>st=new HashSet<String>();
        int len=wordList.size();
        for(int i=0;i<len;i++)
        {
            st.add(wordList.get(i));
        }
        st.remove(beginWord);//as we are processign it now
        while(!q.isEmpty())
        {
            String word=q.peek().words;
            int step=q.peek().steps;
            q.remove();
            
            if(word.equals(endWord)==true)
            {
                return step;
            }
            for(int  i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char[]replaced=word.toCharArray();
                    replaced[i]=ch;
                    String newlyword=new String(replaced);
                    //check if exists in set or not
                    if(st.contains(newlyword)==true)
                    {
                        st.remove(newlyword);
                        q.add(new Pair(newlyword,step+1));
                    }
                }
            }
           
        }
        return 0;

    }
}