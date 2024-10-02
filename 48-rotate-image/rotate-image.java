class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix [j][i];
                matrix[j][i] = temp;
            }
        }
        //change rows
        for(int x=0;x<r;x++)
        {
            int i=0;
            int j=c-1;
            while(i<j)
            {
                int temp = matrix[x][j];
                matrix[x][j] = matrix [x][i];
                matrix[x][i] = temp;
                i++;
                j--;
            }
        }
        
      
    }
}