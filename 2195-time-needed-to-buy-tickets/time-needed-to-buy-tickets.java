class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            que.add(i);//adding the indexes here
        }
        int time=0;
        while(!que.isEmpty())
        {
            time++;
            int front=que.poll();
            tickets[front]--;

            //case
            if(k==front && tickets[front]==0)
            {
                return time;
            }
            if(tickets[front]!=0)//agar 0 hoga then no need to add
            {
                que.add(front);
            }
        }
        return time;
        
    }
}