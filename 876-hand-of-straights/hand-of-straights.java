class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
        {
            return false;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int it:hand)
        {
            pq.add(it);
        }
        while(!pq.isEmpty())
        {
            int cur=pq.poll();
            for(int i=1;i<groupSize;i++)
            {
                if(!pq.remove(cur+i))
                {
                    return false;
                }
            }
        }
        return true;
    }
}