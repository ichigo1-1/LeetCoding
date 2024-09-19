class Solution {
    public int longestSubarray(int[] nums) {
        //note:-
        //if you do and of 2 numbers for example 5 & 1 => the result will always be lesser or equal to the max between two numbers.it will never exceed the max number range
        //just in case you think adding more numbers to the and will increase the and result,thats not true

        //intution
        //as we know the max and we can achieve is the largest number present in the array anded with itself 
        //as 5&5=5 but if we do anything like 5&1 or 5&2 or any thing smaller than 5 the result will not surely always be 5 but its guaranteed that will be smaller in most of the case

        //so we'll find the max number and count its occurence
        int max=Integer.MIN_VALUE;
        int count=0;
        int res=0;
        for (int it:nums) {
            if(it>max)
            {
                max=it;
                res=0;
                count=0;
            }
            if(max==it)
            {
                count++;
            }
            else{
                count=0;
            }
            res=Math.max(res,count);
        }
    return res;
}
}