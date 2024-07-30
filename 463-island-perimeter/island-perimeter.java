class Solution {
    public int islandPerimeter(int[][] grid) {
        //A land contributes to perimeter a value of 4 - number_neighbor_lands
        int perimeter=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    perimeter+=4;
                    //CHECKING ONLY UP AND LEFT BEACUSE WE ARE GOING FROM LEFT TO RIGHT IN THE LOOP
                    //UP 
                    if(i>0 && grid[i-1][j]==1)
                    {
                        perimeter-=2;
                    }
                    //LEFT
                    if(j>0 && grid[i][j-1]==1)
                    {
                        perimeter-=2;
                        //because a sqaure=4 and if both are connected total side would be 8
                        //but perimeter would be reduced by 2 as there is one side of the sqaure which is shared by both the sqaures
                    }
                }
            }
        }
        return perimeter;
    }
}
