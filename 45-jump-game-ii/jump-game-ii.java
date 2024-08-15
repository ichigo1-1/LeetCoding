class Solution {
    public int jump(int[] nums) {
        // return rec(0,0,nums);
        int jumps=0;
        int l=0;
        int r=0;
        while(r<nums.length-1)
        {
            int farthest=0;
            for(int i=l;i<=r;i++)
            {
                farthest=Math.max(farthest,i+nums[i]);
            }
            //update
            jumps+=1;
            l=r+1;
            r=farthest;
        }
        return jumps;
    }
    //RECURSIVE
    // public int rec(int ind,int jumps,int []nums)
    // {
    //     if(ind>=nums.length-1)
    //     {
    //         return jumps;
    //     }
    //     int min=Integer.MAX_VALUE;
    //     for(int i=1;i<=nums[ind];i++)
    //     {
    //         min=Math.min(min,rec(ind+i,jumps+1,nums));
    //     }
    //     return min;
    // }
}