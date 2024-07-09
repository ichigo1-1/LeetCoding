class Solution {
    public int candy(int[] ratings) {
        // int[]left=new int[ratings.length];
        // // int[]right=new int[ratings.length];

        // //step 1:- fill the left
        // left[0]=1;
        // for(int i=1;i<ratings.length;i++)
        // {
        //     if(ratings[i]>ratings[i-1])
        //     {
        //         left[i]=left[i-1]+1;
        //     }
        //     else{
        //         left[i]=1;
        //     }
        // }

        // // //step 2:- fill the right;
        // right[ratings.length-1]=1;
        // for(int i=ratings.length-2;i>=0;i--)
        // {
        //     if(ratings[i]>ratings[i+1])
        //     {
        //         right[i]=right[i+1]+1;
        //     }
        //     else{
        //         right[i]=1;
        //     }
        // }
        // //step 3:- Get the maximium of left and right for thaat index
        // int res=0;
        // for(int i=0;i<ratings.length;i++)
        // {
        //     res+=Math.max(left[i],right[i]);
        // }
        // return res; 
        


        //BETERR SOLUTION**********************
        int n = ratings.length;
        int[] left = new int[n];

        //step 1:- fill the left
        left[0] = 1;
        for(int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i-1]) {
                left[i] = left[i-1] + 1;
            } else {
                left[i] = 1;
            }
        }

        //step 2 and 3
        int res = Math.max(1,left[n-1]);
        int right = 1;
        for(int i = n - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]) {
                right = right + 1;
            } else {
                right = 1;
            }
            res += Math.max(left[i],right);
        }
        return res; // add the candy for the first child
    }
}