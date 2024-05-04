class Solution {
    public int maxScore(int[] cardPoints, int k) {

        //algo
        //step1: get the max of first k elements and store it in
        //step2: keep shrinking  the window and take element from the end
        //step3: keep comparing
        int lsum=0;
        int rsum=0;
        int max=0;
        //Step 1:
        for(int i=0;i<=k-1;i++)
        {
            lsum+=cardPoints[i];
        }
        max=lsum;
        //step 2:
        int endIndex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-cardPoints[i];//shrinking the window so removed it
            //add the el from right
            rsum+=cardPoints[endIndex];
            //next time you shrink you need to take the second element from last and so on
            endIndex=endIndex-1;
            max=Math.max(max,lsum+rsum);
        }
        return max;
        
    }
}