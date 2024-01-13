class Solution {
    public boolean bfs(int arr[][],int start,int color[])
    {
        int n=arr.length;
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        color[start]=0;

        while(!q.isEmpty())
        {
            int node = q.peek();
            q.remove();
            for(int it:arr[node])
            {
                if(color[it]==-1)
                {
                    color[it]=1-color[node];
                    q.add(it);
                }
                else if(color[it]==color[node])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] arr) {
        int n=arr.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                if(bfs(arr,i,color)==false)
                {
                    return false;
                }
            }
        }
        return true;
        
        
    }
}