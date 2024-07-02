class Pair{
    int first,second,third;
    Pair(int f,int s,int t)
    {
        first=f;
        second=s;
        third=t;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        //USE BFS
        Queue<Pair>q=new LinkedList<>();
        int n=mat.length;
        int m=mat[0].length;
        int[][]newly=new int[n][m];
        boolean[][]vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        int []drow={-1,0,1,0};
        int[]dcol={0,1,0,-1};
        while(!q.isEmpty())
        {
            int fi=q.peek().first;
            int se=q.peek().second;
            int th=q.peek().third;
            newly[fi][se]=th;
            q.remove();
            for(int i=0;i<4;i++)
            {
                int row=fi+drow[i];
                int col=se+dcol[i];
                if(row>=0 && col>=0 && row<n && col<m && vis[row][col]==false)
                {
                    q.add(new Pair(row,col,th+1));
                    vis[row][col]=true;
                }
            }
         
        }
           return newly;


    }
}