// class Pair{
//     int row;
//     int col;
//     int time;
//     public Pair(int row,int col,int time)
//     {
//         this.row=row;
//         this.col=col;
//         this.time=time;
//     }
// }
// class Solution {
//     public int orangesRotting(int[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         int countFresh=0;
        
//         Queue<Pair>q=new LinkedList<Pair>();
//         int[][]vis=new int[n][m];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(grid[i][j]==2)
//                 {
//                     q.add(new Pair(i,j,0));
//                     vis[i][j]=2;
//                 }
//                 else{
//                     vis[i][j]=0;
//                 }
//                 //to check at last wheter all the fresh are converted or not
//                 if(grid[i][j]==1)
//                 {
//                     countFresh++;
//                 }
                
//             }
//         }
//         int time=0;
//         int drow[]={-1,0,1,0};
//         int dcol[]={0,1,0,-1};
//         int count=0;
//         while(!q.isEmpty())
//         {
//             int ro=q.peek().row;
//             int co=q.peek().col;
//             int tm=q.peek().time;
//             time=Math.max(time,tm);//pehle wla time ans current time ko compare karo
//             q.remove();
//             //traverse neighbours
//             for(int i=0;i<4;i++)
//             {
//                 int nrow=ro+drow[i];
//                 int ncol=co+dcol[i];

//                 if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
//                 {
//                     q.add(new Pair(nrow,ncol,tm+1));
//                     vis[nrow][ncol]=2;
//                     count++;
//                 }
//             }
//         }

//         //check if all the fresh are converted to rotten or not if not return -1
//         if(count!=countFresh)
//         {
//             return -1;
//         }
//         return time;

        
//     }
// }
class Pair
{
    int r;
    int c;
    int tm;
    Pair(int r,int c,int tm)
    {
        this.r=r;
        this.c=c;
        this.tm=tm;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int drow[]={1,-1,0,0};
        int dcol[]={0,0,-1,1};
        
        Queue<Pair>q=new LinkedList<Pair>();
        int[][]vis=new int[n][m];
        int count=0;
        int countfresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
                if(grid[i][j]==0)
                {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1)
                {
                    countfresh++;
                }
            }
        }
        //now popping time
        int mintime=0;
        
        while(!q.isEmpty())
        {
            int ro=q.peek().r;
            int co=q.peek().c;
            int t=q.peek().tm;
            mintime=Math.max(t,mintime);
            q.poll();
            
            //check for neighbors
            for(int i=0;i<4;i++)
            {
                int nr=ro+drow[i];
                int nc=co+dcol[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && grid[nr][nc]==1)
                {
                    q.add(new Pair(nr,nc,t+1));
                    vis[nr][nc]=2;
                    count++;
                }
            }
        }
        if(count!=countfresh)
        {
            return -1;
        }
        else{
            return mintime;
        }
        
        
    }
}