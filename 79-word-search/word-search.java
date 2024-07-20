class Solution {
    public boolean helper(int i,int j,String word,char[][]board,int idx,int n,int m)
    {
        if(idx==word.length())
        {
            return true;
        }
        if(i<0 || j<0 || i>=n || j>=m || board[i][j]=='$')
        {
            return false;
        }
        if(board[i][j]!=word.charAt(idx))
        {
            return false;
        }
        //mark as visited
        char temp=board[i][j];
        board[i][j]='$';
        int[]drow={-1,0,1,0};
        int []dcol={0,1,0,-1};
        for(int x=0;x<4;x++)
        {
            int nrow=i+drow[x];
            int ncol=j+dcol[x];
            if(helper(nrow,ncol,word,board,idx+1,n,m)==true)
            {
                return true;
            }
        }
        board[i][j]=temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(helper(i,j,word,board,0,n,m)==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}