class Solution {
    public int nthUglyNumber(int n) {
        //we ll be creating the sequence
        //take 3 pointers 
        //1*2=>2*2=>3*2=>4*2
        //1*3=>2*3=>3*3=>4*3
        //1*5=>2*5=>3*5=>4*5
        int[]ans=new int[n];
        int i1=0,i2=0,i3=0;
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            int nextseq=Math.min(Math.min(ans[i1]*2,ans[i2]*3),ans[i3]*5);
            ans[i]=nextseq;
            //move pointers
            if(nextseq==ans[i1]*2)
            {
                i1++;
            }
            if(nextseq==ans[i2]*3)
            {
                i2++;
            }
            if(nextseq==ans[i3]*5)
            {
                i3++;
            }
        }
        return ans[n-1];
    }
}