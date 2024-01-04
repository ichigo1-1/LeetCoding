class Solution {
    public int max(int[][]a,int n,int m,int col)
    {
        int max=-1;
        int index=-1;
        
        for(int i=0;i<n;i++)
        {
            if(a[i][col]>max)
            {
                max=a[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int low=0;
        int high=m-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            int max_row=max(mat,n,m,mid);
            int left=mid-1>0?mat[max_row][mid-1]:-1;
            int right=mid+1<m?mat[max_row][mid+1]:-1;
            
            if(mat[max_row][mid]>left && mat[max_row][mid]>right)
            {
                return new int[]{max_row,mid};
            }
            else if(mat[max_row][mid]<right)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }
        return new int[]{-1,-1};
            
        
        
        
    }
}