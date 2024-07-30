class Solution {
    public void dfs(int r,int c,boolean[][]vis,int color,int[]drow,int[]dcol,int[][]res,int[][]image,int init)
    {
        res[r][c]=color;
        int n=image.length;
        int m=image[0].length;
        vis[r][c]=true;
        for(int i=0;i<4;i++)
        {
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && vis[nrow][ncol]==false && image[nrow][ncol]==init)
            {
                dfs(nrow,ncol,vis,color,drow,dcol,res,image,init);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor=image[sr][sc];
        int n=image.length;
        int m=image[0].length;
        int[][]res=image.clone();
        boolean[][]vis=new boolean[n][m];
        int []drow={-1,0,1,0};
        int []dcol={0,1,0,-1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(image[i][j]==initialcolor && vis[i][j]==false)
                {
                    dfs(sr,sc,vis,color,drow,dcol,res,image,initialcolor);
                }
            }
        }
        return res;
    }
}