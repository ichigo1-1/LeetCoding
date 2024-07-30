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
        int n=isConnected.length;//this will give the number of nodes V
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
        boolean[]vis=new boolean[n];//exactlty 3
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                //what this will do is that it'll mark all the neighboring 1s if 1 1 is found;
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}










