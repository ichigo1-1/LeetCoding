class Solution {
    public int[] singleNumber(int[] nums) {
    //     int[]res=new int[2];
    //     int xor=0;
    //     for(int it:nums)
    //     {
    //         xor^=it;
    //     }
    //     //find the rightmost bit
    //     int rightbit=xor&~(xor-1);
    //     int set1=0;
    //     int set2=0;
    //     for(int it:nums)
    //     {
    //         if((rightbit & it)==0)
    //         {
    //             set1^=it;
    //         }
    //         else{
    //             set2^=it;
    //         }
    //     }
    //   res[0]=set1;
    //   res[1]=set2;
    //     return res;



    // HashMap<Integer,Integer>hm=new HashMap<>();
    // int[]res=new int[2];
    // for(int it:nums)
    // {
    //     hm.put(it,hm.getOrDefault(it,0)+1);
    // }
    // int i=0;
    // for(int it:hm.keySet())
    // {
    //     if(hm.get(it)==1)
    //     {
    //         res[i]=it;
    //         i++;
    //     }
    // }
    // return res;
    int xor=0;
    for(int i=0;i<nums.length;i++)
    {
        xor^=nums[i];
    }
    //this will give a number 
    //now we need to distinguish between digits based on 1st occurence oof 1
    int rightmost=(xor&(xor-1))^xor;
    int firstxor=0;
    int secondxor=0;
    //now travserse
    for(int i=0;i<nums.length;i++)
    {
        if((nums[i]&rightmost)!=0)
        {
            firstxor=firstxor^nums[i];
        }
        else{
            secondxor=secondxor^nums[i];
        }
    }
    int[]res=new int[2];
    res[0]=firstxor;
    res[1]=secondxor;
    return res;
    }
}