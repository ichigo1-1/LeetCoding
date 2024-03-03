// class Pair{
//     int first;
//     int second;
//     public Pair(int first,int second)
//     {
//         this.first=first;
//         this.second=second;
//     }
// }
// class Solution {
//     private void bfs(int ro,int co,int[][]vis,char[][]grid)
//     {
//         vis[ro][co]=1;
//         Queue<Pair>q=new LinkedList<Pair>();
//         q.add(new Pair(ro,co));

//         int n=grid.length;
//         int m=grid[0].length;

//         while(!q.isEmpty())
//         {
//             int row=q.peek().first;
//             int col=q.peek().second;
//             q.poll();

//             //traverse all the neighbors
//             for(int delrow=-1;delrow<=1;delrow++)
//             {
//                 for(int delcol=-1;delcol<=1;delcol++)
//                 {
//                     int nrow=row+delrow;
//                     int ncol=col+delcol;
//                     if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&vis[nrow][ncol]==0&&grid[nrow][ncol]=='1')
//                     {
//                         vis[nrow][ncol]=1;
//                         q.add(new Pair(nrow,ncol));
//                     }
//                 }
//             }
//         }
//     }
//     public int numIslands(char[][] grid) {

//         int row=grid.length;
//         int col=grid[0].length;
//         int[][]vis=new int[row][col];
//         int count=0;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 if(vis[i][j]==0 && grid[i][j]=='1')
//                 {
//                     count++;
//                     bfs(i,j,vis,grid);
                    
//                 }
//             }
//         }
//         return count;
        
//     }
// }
import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    private void bfs(int r, int c, char[][] grid, int[][] vis) {
        ////////////RIGHT,DOWN,LEFT,UP
        int[] drow = {0, 1, 0, -1};
        int[] dcol = {1, 0, -1, 0};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c));
        vis[r][c] = 1;

        while (!q.isEmpty()) {
            int p = q.peek().first;
            int s = q.peek().second;
            q.poll();//removes front element

            for (int i = 0; i < 4; i++) {
                int nr = p + drow[i];
                int nc = s + dcol[i];

                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == '1' && vis[nr][nc] == 0) {
                    q.add(new Pair(nr, nc));
                    vis[nr][nc] = 1;
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int ans = 0;
        int r = grid.length;
        int c = grid[0].length;
        int[][] vis = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    bfs(i, j, grid, vis);
                    ans++;
                }
            }
        }

        return ans;
    }
}

