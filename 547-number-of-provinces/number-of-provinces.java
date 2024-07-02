class Solution {
    public void dfs(int i,ArrayList<ArrayList<Integer>>adj,boolean[]vis)
    {
        vis[i]=true;
        for(int it:adj.get(i))
        {
            if(vis[it]==false)
            {
                dfs(it,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        //now put
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1)
                {
                    adj.get(i).add(j);
                }
            }
        }
        //
        boolean[]vis=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}