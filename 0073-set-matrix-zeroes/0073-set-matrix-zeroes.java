class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        
       ArrayList<Integer>x = new ArrayList<>();
        ArrayList<Integer>y = new ArrayList<>();
        
        //IDHAR ROW AND COLUMN KA INDEX STORE KAR RAHA H JAHA 0 H
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        
        for(int i=0;i<x.size();i++)
        {
            int index=x.get(i);
            for(int j=0;j<col;j++)
            {
                matrix[index][j]=0;
            }
        }
        
        for(int i=0;i<y.size();i++)
        {
            int index2=y.get(i);
            for(int j=0;j<row;j++)
            {
                matrix[j][index2]=0;
            }
        }
        
}
}