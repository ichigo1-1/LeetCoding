class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int it:nums)
        {
            hm.put(it,hm.getOrDefault(it,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue().compareTo(a.getValue()));
        for(Map.Entry entry:hm.entrySet())
        {
            pq.add(entry);
        }
        int[]res=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=pq.poll().getKey();
        }
        return res;
    }
}