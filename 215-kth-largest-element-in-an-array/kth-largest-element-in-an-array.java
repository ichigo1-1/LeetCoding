class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int it:nums)
        {
            pq.add(it);
        }
        while(k>1)
        {
            pq.poll();
            k--;
        }
        return pq.remove();

    }
}