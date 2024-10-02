class Solution {
    public int[] arrayRankTransform(int[] arr) {
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    HashMap<Integer,Integer>hm=new HashMap<>();
     int N=arr.length;
     for(int it:arr)
     {
        pq.add(it);
     }
     int rank=0;
     while(!pq.isEmpty())
     {
         int a=pq.poll();
         if(!hm.containsKey(a))
         {
            hm.put(a,++rank);
         }
    }
    
    for(int i=0;i<N;i++)
    {
        arr[i]=hm.get(arr[i]);
    }
    return arr;

    }
}