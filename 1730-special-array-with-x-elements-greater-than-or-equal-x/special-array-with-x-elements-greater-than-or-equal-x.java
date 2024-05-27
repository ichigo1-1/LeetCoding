class Solution {
    public int counts(int []nums,int x)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=x)
            {
                count++;
            }
        }
        return count;
    }
    public int specialArray(int[] nums) {
        int n=nums.length;
       
        for(int x=0;x<=n;x++)
        {
            int counter=counts(nums,x);
            if(counter==x)
            {
                return x;
            }
            
        }
        return -1;
        
    }
}