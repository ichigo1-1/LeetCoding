class Pair{
    int p1,p2;
    long sq;
    Pair(int p,int q,long s)
    {
        p1=p;
        p2=q;
        sq=s;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Long.compare(b.sq,a.sq));//Max Heap
        for(int []point:points)
        {
            int p1=point[0];
            int p2=point[1];
            long sq=(long)p1*p1 + (long) p2*p2;
            pq.offer(new Pair(p1,p2,sq));

            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        //get the k closest
        int[][]res=new int[k][2];
        int index=0;
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            res[index][0]=p.p1;
            res[index][1]=p.p2;
            index++;
        }
        return res;
    }
}