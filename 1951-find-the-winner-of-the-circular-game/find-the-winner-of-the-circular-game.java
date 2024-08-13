class Solution {
    public int findTheWinner(int n, int k) {

        // ArrayList<Integer>as=new ArrayList<>();
        // //add all the friends
        // for(int i=1;i<=n;i++)
        // {
        //     as.add(i);
        // }
        // //Game starts from 1st player which is sitting at index 0 in arr
        // int i=0;
        // while(as.size()>1)
        // {
        //     int idx=(i+k-1)%as.size();
        //     as.remove(idx);
        //     i=idx;
        // }
        // return as.get(0);

                        //USING QUEUE
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            q.add(i);

        }   
        while(q.size()>1)
        {
            for(int it=1;it<k;it++)
            {
                q.add(q.poll());
            }
            //now delete the topmost
            q.poll();
        }            
        return q.peek(); 
    }
}