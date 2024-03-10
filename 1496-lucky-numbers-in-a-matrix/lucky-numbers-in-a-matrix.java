class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int svj=0;
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<matrix[i][svj])
                {
                    svj=j;
                }
            }
            boolean flag=true;
            //now col check wheter max in that col or not;
            for(int k=0;k<matrix.length;k++)
            {
                if(matrix[k][svj]>matrix[i][svj])
                {
                    flag=false;
                }
            }
            if(flag==true)
            {
                ans.add(matrix[i][svj]);
                return ans;
            }
        }
       
        return ans;

        
    }
}