class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = numCourses;
        int n = prerequisites.length;
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]); // Add prerequisites correctly
        }

        // Code for topological sort
        int[] indegree = new int[v];
        for (int i = 0; i < v; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++; // Increment indegree of the destination vertex
            }
        }
        
        int[] topo = new int[v];
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        
        int ind = 0;
        while (!q.isEmpty()) {
            int peekelement = q.peek();
            q.remove();
            topo[ind++] = peekelement;
            // Look for neighbors
            for (int it : adj.get(peekelement)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        
        if (ind == v) { // If all courses can be completed
            return topo;
        } else {
            return new int[]{}; // If there is a cycle or some courses cannot be completed
        }
    }
    }
    