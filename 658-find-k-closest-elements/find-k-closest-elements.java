class Pair implements Comparable<Pair> {
    int gap;
    int value;
    
    Pair(int g, int v) {
        gap = g;
        value = v;
    }
    
    public int compareTo(Pair o) {
        if (this.gap == o.gap) {
            return this.value - o.value; // Comparing by value when gaps are equal
        } else {
            return this.gap - o.gap; // Comparing by gap otherwise
        }
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (pq.size() < k) {
                pq.add(new Pair(Math.abs(arr[i] - x), arr[i]));
            } else {
                if (pq.peek().gap > Math.abs(arr[i] - x)) {
                    pq.poll(); // Remove the maximum gap element
                    pq.add(new Pair(Math.abs(arr[i] - x), arr[i]));
                }
            }
        }
        
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            res.add(p.value);
        }
        
        Collections.sort(res); // Sorting the final result
        return res;
    }
}
