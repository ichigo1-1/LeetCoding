class Solution {
    public void gameOfLife(int[][] board) {
        int[][]directions={{-1,0},{0,-1},{1,0},{0,1},{-1,1},{1,1},{1,-1},{-1,-1}};
        int n=board.length;
        int m=board[0].length;

        //iterate
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int live=0;
                for(int []dir:directions)
                {
                    int r= i + dir[0];
                    int c= j + dir[1];
                    // Check if the neighbor is within the bounds of the board and is alive (1) or dead (-1)
                    if(r>=0 && c>=0 && r<n && c<m && (board[r][c]==1 || board[r][c]==-1))
                    {
                        live++;
                    }

                }
                if(board[i][j]==1 &&(live<2 || live>3))
                {
                    board[i][j]=-1;//NEXT STATE:-DEAD
                }
                if(board[i][j]==0 && live==3)
                {
                    board[i][j]=2;//NEXT STATE:- ALIVE
                }
            }
        }
        //update
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==-1)
                {
                    board[i][j]=0;//dead state
                }
                else if(board[i][j]==2)
                {
                    board[i][j]=1;//ALIVE
                }
            }
        }
    }
}