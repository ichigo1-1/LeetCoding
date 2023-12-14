class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:nums)
        {
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        //here's Collections.reverseOrder doesnt work because the values here is of type Hashmap$node and pq is having problem comapring them so we create a custom comparator using (a,b)-> and compare b value with a and arrange according to that'
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));

        for(Map.Entry entry : hm.entrySet())
        {
            pq.add(entry);
        }
        int[]result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=pq.poll().getKey();
        }
        return result;

        
    }
}