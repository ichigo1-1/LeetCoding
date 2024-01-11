class Solution {
    private void dfs(int sr,int sc,int[][]ans,int[][]image,int color,int drow[],int dcol[],int inicolor)
    {
        ans[sr][sc]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++)
        {
            int nrow=sr + drow[i];
            int ncol=sc + dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=color)
            {
                dfs(nrow,ncol,ans,image,color,drow,dcol,inicolor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inicol=image[sr][sc];
        int[][]ans=image;
        int [] delrow={-1,0,1,0};
        int [] delcol={0,1,0,-1};
        dfs(sr,sc,ans,image,color,delrow,delcol,inicol);
        return ans;
        
    }
}