class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // will work for both col and row wise sorted and fully sorted
        // int row=0;
        // int col=matrix[0].length-1;
        // //1st row ka last element se shuru karo
        // while(row<matrix.length && col>=0)
        // {
        //     if(matrix[row][col]==target)
        //         return true;
        //     if(matrix[row][col]>target)
        //         col--;
        //     else
        //         row++;        
        // }
        // return false;
        
        int r=binay(matrix,target);
        if(r==-1)
        {
            return false;
        }
        boolean ans=binarysearch(matrix,r,target);
        return ans;
    }
    public boolean binarysearch(int[][]matrix,int r,int target)
    {
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(matrix[r][mid]==target)
            {
                return true;
            }
            else if(matrix[r][mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public int binay(int[][]matrix,int target)
    {
        int low=0;
        int high=matrix.length-1;
        int lastcol=matrix[0].length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(matrix[mid][0]<=target && target<=matrix[mid][lastcol])
            {
                return mid;
            }
            else if(matrix[mid][0]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    
    
    //binary approach
    
}