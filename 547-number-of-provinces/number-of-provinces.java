// class Solution {

//     public void dfs(int start,List<List<Integer>> adj,boolean[]vis)
//     {
//         vis[start]=true;
//         for(int it:adj.get(start))
//         {
//             if(vis[it]==false)
//             {
//                 dfs(it,adj,vis);
//             }
//         }
//     }
//     public int findCircleNum(int[][] isConnected) {
//         //convert to list
//         int n=isConnected.length;

//         List<List<Integer>> adjacencyList = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             adjacencyList.add(new ArrayList<>());
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (isConnected[i][j] == 1) {
//                     adjacencyList.get(i).add(j);
                   
//                 }
//             }
//         }
//         boolean[]visited=new boolean[n+1];
//         int count=0;
  
//         for(int i=0;i<n;i++)
//         {
//             if(visited[i]==false)
//             {
//                 count++;
//                 dfs(0,adjacencyList,visited);
//             }
//         }
//         return count;


        
//     }
// }

import java.util.*;

class Solution {

    public void dfs(int start, List<List<Integer>> adj, boolean[] vis) {
        vis[start] = true;
        for (int it : adj.get(start)) {
            if (!vis[it]) {
                dfs(it, adj, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    adjacencyList.get(i).add(j);
                }
            }
        }
        boolean[] visited = new boolean[n]; // Fix array size
        int count = 0;

        for (int i = 0; i < n; i++) { 
            if (!visited[i]) { 
                count++;
                dfs(i, adjacencyList, visited); // Fix parameter to pass current node
            }
        }
        return count;
    }
}
