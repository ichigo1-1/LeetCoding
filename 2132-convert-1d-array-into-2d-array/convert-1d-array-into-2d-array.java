class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int l=original.length;
        if(l!=n*m)
        {
            return new int[][]{};
        }
        int index=0;
        int[][]temp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j]=original[index];
                index++;
            }
        }
        return temp;
    }
}