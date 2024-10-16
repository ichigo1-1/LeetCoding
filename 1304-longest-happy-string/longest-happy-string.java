class Pair implements Comparable<Pair>{
    char ch;
    int freq;
    Pair(char c,int f)
    {
        ch=c;
        freq=f;
    }
    
    public int compareTo(Pair other) {
        return Integer.compare(this.freq, other.freq);
    }
}
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb=new StringBuilder();
        //create a max heap to easily get the max freq character as if they are filled at last then aaa/bbb/ccc could form which would not lead to longest sequence

        //also just not store the frequency but the character also
        PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        if(a>0)
        {
            pq.offer(new Pair('a',a));
        }
        if(b>0)
        {
            pq.offer(new Pair('b',b));
        }
        if(c>0)
        {
            pq.offer(new Pair('c',c));
        }

        //now get the elements and build result
        while(!pq.isEmpty())
        {
            char curchar=pq.peek().ch;
            int curfreq=pq.peek().freq;
            //pop it
            pq.poll();

            //check if we can use it by checking last 2 chars are same  or not to avoid aaa/bbb/ccc
            if(sb.length()>=2 && sb.charAt(sb.length()-1)==curchar && sb.charAt(sb.length()-2)==curchar)
            {
                //we cant use it
                //pop another max from heap

                if(pq.isEmpty())
                {
                    break;
                }

                char nextchar=pq.peek().ch;
                int nextfreq=pq.peek().freq;
                //pop it
                pq.poll();

                //push to result
                sb.append(nextchar);
                nextfreq--;
                if(nextfreq>0)
                {
                    pq.offer(new Pair(nextchar,nextfreq));
                }
                
            }
            else{
                //you can append characters as aaa/bbb/ccc are not formed
                curfreq--;
                sb.append(curchar);
            }
            if(curfreq>0)
            {
                pq.offer(new Pair(curchar,curfreq));
            }
        }
        return sb.toString();
    }
}