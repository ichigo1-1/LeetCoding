class Solution {
    int n,m;
    int[]di={-1,0,1,0};
    int[]dj={0,1,0,-1};
    public int solve(int i,int j,int[][]grid)
    {
        //base case 
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0)
        {
            return 0;
        }
        //get the current gold value
        int ogvalue=grid[i][j];
        grid[i][j]=0;//to mark it AS TAKEN
        int maxgold=0;
        //traverse
        for(int x=0;x<4;x++)
        {
            int nrow=i+di[x];
            int ncol=j+dj[x];
            maxgold=Math.max(maxgold,solve(nrow,ncol,grid));//this will give the max of upsum,downsum,leftsum,rightsum
        }
        //bring back the old valuel
        grid[i][j]=ogvalue;
        return ogvalue+maxgold;//TECH TRAVERSAL

    }
    public int getMaximumGold(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int result=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!=0)
                {
                    result=Math.max(result,solve(i,j,grid));
                }
            }
        }
        return result;
    }
}