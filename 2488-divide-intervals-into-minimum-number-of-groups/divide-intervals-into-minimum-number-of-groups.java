class Solution {
    public int minGroups(int[][] intervals) {
        //always sort in case of intervals
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int[]it:intervals)
        {
            int start=it[0];
            int end=it[1];
            // If the top of the queue (smallest end time) is smaller than the current start time
            // we can merge the interval into an existing group, so we pop the earliest end time
            if(!pq.isEmpty() && pq.peek()<start)
            {
                pq.poll();
            }
            pq.offer(end);
        }
        return pq.size();
    }
}