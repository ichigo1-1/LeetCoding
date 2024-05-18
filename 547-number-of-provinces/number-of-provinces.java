class Solution {
    public void dfs(int node,boolean[]vis,ArrayList<ArrayList<Integer>>arr)
    {
        vis[node]=true;
        //visit adj
        for(int it:arr.get(node))
        {
            if(vis[it]==false)
            {
                dfs(it,vis,arr);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<>());
        }
        
        //now traverse
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1)
                {
                    //add to list
                    arr.get(i).add(j);
                }
            }
        }
        //now traverse using dfs
        boolean[]vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                dfs(i,vis,arr);
                count++;
            }
        }
        return count;
    }
}