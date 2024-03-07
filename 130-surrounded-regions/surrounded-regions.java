class Solution {
    public void dfs(int r,int c,int[][]vis,char[][]board,int[]drow,int[]dcol)
    {
        vis[r][c]=1;
        int n=board.length;
        int m=board[0].length;

        
        
        for(int i=0;i<4;i++)
        {
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && board[nrow][ncol]=='O')
            {
                dfs(nrow,ncol,vis,board,drow,dcol);
            }
        }

    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;

        int[][]vis=new int[n][m];
        int[]drow={-1,0,1,0};
        int[]dcol={0,1,0,-1};
        
        for(int i=0;i<m;i++)
        {
            //first row
            if(vis[0][i]==0 && board[0][i]=='O')
            {
                dfs(0,i,vis,board,drow,dcol);
            }
             if(vis[n-1][i]==0 && board[n-1][i]=='O')
            {
                dfs(n-1,i,vis,board,drow,dcol);
            }
        }

        for(int j=0;j<n;j++)
        {
            //first col
            if(vis[j][0]==0 && board[j][0]=='O')
            {
                dfs(j,0,vis,board,drow,dcol);
            }
            if(vis[j][m-1]==0 && board[j][m-1]=='O')
            {
                dfs(j,m-1,vis,board,drow,dcol);
            }
        }

        //now convert all remaing  x to 0
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && board[i][j]=='O')
                {
                    board[i][j]='X';
                }
            }
        }


        
    }
}