import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // List<Integer> ans = new ArrayList<>();

        // int minrow = 0;
        // int mincol = 0;
        // int maxrow = matrix.length;
        // int maxcol = matrix[0].length;

        // //to check all elements 
        // int tne = maxrow * maxcol;
        // int count = 0;

        // while (tne > count) {
        //     //top
        //     for (int i = mincol; i < maxcol && count < tne; i++) {
        //         ans.add(matrix[minrow][i]);
        //         count++;
        //     }
        //     minrow++;

        //     //right
        //     for (int i = minrow; i < maxrow && count < tne; i++) {
        //         ans.add(matrix[i][maxcol - 1]);
        //         count++;
        //     }
        //     maxcol--;

        //     //bottom
        //     for (int i = maxcol - 1; i >= mincol && count < tne; i--) {
        //         ans.add(matrix[maxrow - 1][i]);
        //         count++;
        //     }
        //     maxrow--;

        //     //left
        //     for (int i = maxrow - 1; i >= minrow && count < tne; i--) {
        //         ans.add(matrix[i][mincol]);
        //         count++;
        //     }
        //     mincol++;
        // }
        // return ans;

        List<Integer>ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int tne=n*m;
        int minrow=0;
        int mincol=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        int count=0;
        while(count<n*m)
        {
            //top
            for(int i=mincol;i<=maxcol&&count<tne;i++)
            {
                ans.add(matrix[minrow][i]);
                count++;
            }
            minrow++;

            //right
            for(int i=minrow;i<=maxrow&&count<tne;i++)
            {
                ans.add(matrix[i][maxcol]);
                count++;
            }
            maxcol--;

            //bottom
            for(int i=maxcol;i>=mincol&&count<tne;i--)
            {
                ans.add(matrix[maxrow][i]);
                count++;
            }
            maxrow--;

            //left
            for(int i=maxrow;i>=minrow&&count<tne;i--)
            {
                ans.add(matrix[i][mincol]);
                count++;
            }
            mincol++;
        }
        return ans;
    }
}
