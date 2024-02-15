class Solution {
    public int max(int[][]matrix,int i,int j,int row,int col)
    {
        int max=Integer.MIN_VALUE;
        for(int x=0;x<row;x++)
        {
            if(matrix[x][j]>max)
            {
                max=matrix[x][j];
            }
        }


        
        return max;
        

    }
    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=max(matrix,i,j,row,col);
                }
            }
        }
        return matrix;
        
    }
}