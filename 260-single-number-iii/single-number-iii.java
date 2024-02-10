class Solution {
    public int[] singleNumber(int[] nums) {
        int[]res=new int[2];
        int xor=0;
        for(int it:nums)
        {
            xor^=it;
        }
        //find the rightmost bit
        int rightbit=xor&~(xor-1);
        int set1=0;
        int set2=0;
        for(int it:nums)
        {
            if((rightbit & it)==0)
            {
                set1^=it;
            }
            else{
                set2^=it;
            }
        }
      res[0]=set1;
      res[1]=set2;
        return res;
    }
}