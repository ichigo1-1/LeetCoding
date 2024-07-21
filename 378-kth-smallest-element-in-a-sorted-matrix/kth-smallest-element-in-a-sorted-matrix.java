class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //formula for box number is 
        int totalrow=matrix.length;
        int totalcol=matrix[0].length;
        
        int[]arr=new int[totalrow*totalcol];
        for(int i=0;i<totalrow;i++)
        {
            for(int j=0;j<totalcol;j++)
            {
                int boxno=i*totalcol+j;
                arr[boxno]=matrix[i][j];
            }
        }
        Arrays.sort(arr);

        return arr[k-1];
    }
}